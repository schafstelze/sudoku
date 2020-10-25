package de.schafstelze;

import static de.schafstelze.Position.at;
import static de.schafstelze.Number.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

import de.schafstelze.Sudoku.SudokuBuilder;

public class SudokuTest {
	
	@Test
	public void setContent() {
		Sudoku sudoku = new SudokuBuilder().build();
		
		sudoku.cell(at(THREE, FIVE)).apply(NINE);
		
		assertThat(sudoku.getContent(at(THREE, FIVE)), is(NINE));
	}
	
	@Test
	public void checkRowOrder() {
		Sudoku sudoku = new SudokuBuilder()
				.addStaticCell(at(ONE, ONE), ONE)
				.addStaticCell(at(ONE, TWO), FIVE)
				.addStaticCell(at(ONE, NINE), EIGHT)
				.build();
		
		List<Cell> row = sudoku.getRow(ONE);
		
		assertThat(row.get(0).getContent(), is(ONE));
		assertThat(row.get(1).getContent(), is(FIVE));
		assertThat(row.get(8).getContent(), is(EIGHT));
	}

	@Test
	public void checkColumnOrder() {
		Sudoku sudoku = new SudokuBuilder()
				.addStaticCell(at(ONE, FIVE), ONE)
				.addStaticCell(at(THREE, FIVE), FIVE)
				.addStaticCell(at(SIX, FIVE), EIGHT)
				.build();
		
		List<Cell> column = sudoku.getColumn(FIVE);
		
		assertThat(column.get(0).getContent(), is(ONE));
		assertThat(column.get(2).getContent(), is(FIVE));
		assertThat(column.get(5).getContent(), is(EIGHT));
	}

	@Test
	public void print_filled_Sudoku() {
		Sudoku sudoku = new SudokuBuilder().build();

		NUMBER_LIST.forEach(rowNumber ->
				NUMBER_LIST.forEach(columnNumber ->
						sudoku.cell(at(rowNumber, columnNumber)).apply(columnNumber))
		);

		String expectedString =
				"""
             =========================================
             || 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||
             -----------------------------------------
             || 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||
             -----------------------------------------
             || 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||
             =========================================
             || 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||
             -----------------------------------------
             || 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||
             -----------------------------------------
             || 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||
             =========================================
             || 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||
             -----------------------------------------
             || 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||
             -----------------------------------------
             || 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||
             =========================================
             """;

		assertThat(sudoku.toString(), is(expectedString));
	}

	@Test
	public void print_empty_Sudoku() {
		Sudoku sudoku = new SudokuBuilder().build();

		String expectedString =
				"""
             =========================================
             ||   |   |   ||   |   |   ||   |   |   ||
             -----------------------------------------
             ||   |   |   ||   |   |   ||   |   |   ||
             -----------------------------------------
             ||   |   |   ||   |   |   ||   |   |   ||
             =========================================
             ||   |   |   ||   |   |   ||   |   |   ||
             -----------------------------------------
             ||   |   |   ||   |   |   ||   |   |   ||
             -----------------------------------------
             ||   |   |   ||   |   |   ||   |   |   ||
             =========================================
             ||   |   |   ||   |   |   ||   |   |   ||
             -----------------------------------------
             ||   |   |   ||   |   |   ||   |   |   ||
             -----------------------------------------
             ||   |   |   ||   |   |   ||   |   |   ||
             =========================================
             """;

		assertThat(sudoku.toString(), is(expectedString));
	}

}
