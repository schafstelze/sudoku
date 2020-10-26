package de.schafstelze.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;

import static de.schafstelze.model.Number.NUMBER_LIST;

public class Sudoku {

	private final Table<Number, Number, Cell> field;
	
	private Sudoku(final Table<Number, Number, Cell> field) {
		this.field = field;
	}
	
	public List<Cell> getRow(final Number rowKey) {
		return toCellList(field.row(rowKey));
	}
	
	public List<Cell> getColumn(final Number columnKey) {
		return toCellList(field.column(columnKey));
	}
	
	public Cell cell(final Position position) {
		return field.get(position.getRow(), position.getColumn());
	}
	
	public Number getContent(final Position position) {
		return field.get(position.getRow(), position.getColumn()).getContent();
	}
	
	private List<Cell> toCellList(Map<Number, Cell> input) {
		List<Cell> cells = new ArrayList<>();
		NUMBER_LIST.forEach(number -> cells.add(input.get(number)));
		return cells;
	}

	@Override
	public String toString() {
		String output = FIELD_AS_STRING;

		for (Number rowNumber: NUMBER_LIST) {
			for (Number cellNumber: NUMBER_LIST) {
				Cell cell = field.get(rowNumber, cellNumber);
				String cellIdentifier = rowNumber.asInteger() + "-" + cellNumber.asInteger();
				String cellValue = cell.getContent() == null ? "   " : " " + cell.getContent().asInteger() + " ";

				output = output.replace(cellIdentifier, cellValue);
			}
		}

		return output;
	}
	
	public static class SudokuBuilder {
		
		private final Table<Number, Number, Cell> field;
		
		public SudokuBuilder() {
			field = ArrayTable.create(NUMBER_LIST, NUMBER_LIST);
		}
		
		public SudokuBuilder addStaticCell(final Position position, final Number value) {
			field.put(position.getRow(), position.getColumn(), Cell.immutableWithNumber(value));
			return this;
		}
	
		public Sudoku build() {
			NUMBER_LIST.forEach(rowKey ->
					NUMBER_LIST.forEach(columnKey -> {
						Cell currentCell = field.get(rowKey, columnKey);

						if (currentCell == null) {
							field.put(rowKey, columnKey, Cell.empty());
						}
			}));
			
			return new Sudoku(field);
		}
	}

	private static final String FIELD_AS_STRING =
			"""
            =========================================
            ||1-1|1-2|1-3||1-4|1-5|1-6||1-7|1-8|1-9||
            -----------------------------------------
            ||2-1|2-2|2-3||2-4|2-5|2-6||2-7|2-8|2-9||
            -----------------------------------------
            ||3-1|3-2|3-3||3-4|3-5|3-6||3-7|3-8|3-9||
            =========================================
            ||4-1|4-2|4-3||4-4|4-5|4-6||4-7|4-8|4-9||
            -----------------------------------------
            ||5-1|5-2|5-3||5-4|5-5|5-6||5-7|5-8|5-9||
            -----------------------------------------
            ||6-1|6-2|6-3||6-4|6-5|6-6||6-7|6-8|6-9||
            =========================================
            ||7-1|7-2|7-3||7-4|7-5|7-6||7-7|7-8|7-9||
            -----------------------------------------
            ||8-1|8-2|8-3||8-4|8-5|8-6||8-7|8-8|8-9||
            -----------------------------------------
            ||9-1|9-2|9-3||9-4|9-5|9-6||9-7|9-8|9-9||
            =========================================
            """;

}
