package de.schafstelze.sudoku.model;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.hamcrest.CoreMatchers;

import de.schafstelze.sudoku.model.Sudoku.SudokuBuilder;

public class SudokuTest {
	
	@Test
	void setContent() {
		Sudoku sudoku = new SudokuBuilder().build();
		
		sudoku.cell(Position.at(Number.THREE, Number.FIVE)).apply(Number.NINE);
		
		assertThat(sudoku.getContent(Position.at(Number.THREE, Number.FIVE)), CoreMatchers.is(Number.NINE));
	}
	
	@Test
	void checkRowOrder() {
		Sudoku sudoku = new SudokuBuilder()
				.addStaticCell(Position.at(Number.ONE, Number.ONE), Number.ONE)
				.addStaticCell(Position.at(Number.ONE, Number.TWO), Number.FIVE)
				.addStaticCell(Position.at(Number.ONE, Number.NINE), Number.EIGHT)
				.build();
		
		List<Cell> row = sudoku.getRow(Number.ONE);
		
		assertThat(row.get(0).getContent(), CoreMatchers.is(Number.ONE));
		assertThat(row.get(1).getContent(), CoreMatchers.is(Number.FIVE));
		assertThat(row.get(8).getContent(), CoreMatchers.is(Number.EIGHT));
	}

	@Test
	void checkColumnOrder() {
		Sudoku sudoku = new SudokuBuilder()
				.addStaticCell(Position.at(Number.ONE, Number.FIVE), Number.ONE)
				.addStaticCell(Position.at(Number.THREE, Number.FIVE), Number.FIVE)
				.addStaticCell(Position.at(Number.SIX, Number.FIVE), Number.EIGHT)
				.build();
		
		List<Cell> column = sudoku.getColumn(Number.FIVE);
		
		assertThat(column.get(0).getContent(), CoreMatchers.is(Number.ONE));
		assertThat(column.get(2).getContent(), CoreMatchers.is(Number.FIVE));
		assertThat(column.get(5).getContent(), CoreMatchers.is(Number.EIGHT));
	}

	@Test
	void print_filled_Sudoku() {
		Sudoku sudoku = new SudokuBuilder().build();

		Number.NUMBER_LIST.forEach(rowNumber ->
				Number.NUMBER_LIST.forEach(columnNumber ->
						sudoku.cell(Position.at(rowNumber, columnNumber)).apply(columnNumber))
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
	void print_empty_Sudoku() {
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
