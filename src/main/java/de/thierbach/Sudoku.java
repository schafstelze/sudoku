package de.thierbach;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;

import static de.thierbach.Number.NUMBER_LIST;

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
		NUMBER_LIST.stream().forEach(number -> cells.add(input.get(number)));
		return cells;
	}
	
	public static class SudokuBuilder {
		
		private Table<Number, Number, Cell> field;
		
		public SudokuBuilder() {
			field = ArrayTable.create(NUMBER_LIST, NUMBER_LIST);
		}
		
		public SudokuBuilder addStaticCell(final Position position, final Number value) {
			field.put(position.getRow(), position.getColumn(), Cell.immutableWithNumber(value));
			return this;
		}
	
		public Sudoku build() {
			NUMBER_LIST.stream().forEach(rowKey -> {
				NUMBER_LIST.stream().forEach(columnKey -> {
					Cell currentCell = field.get(rowKey, columnKey);
					
					if (currentCell == null) {
						field.put(rowKey, columnKey, Cell.empty());
					}
				});
			});
			
			return new Sudoku(field);
		}
	}
	
}
