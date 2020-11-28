package de.schafstelze.sudoku.model;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.nullValue;

import org.hamcrest.CoreMatchers;

import de.schafstelze.sudoku.model.Sudoku.SudokuBuilder;

public class SudokuBuilderTest {

	@Test
	void buildReturnsSudokuWithEmptyCells() {
		Sudoku sudoku = new SudokuBuilder().build();
		
		Number.NUMBER_LIST.forEach(
				number -> sudoku.getRow(number).forEach(
						cell -> assertThat(cell.getContent(), is(nullValue()))
				));
	}

	@Test
	void addStaticCellAndBuild() {
		Sudoku sudoku = new SudokuBuilder().addStaticCell(Position.at(Number.ONE, Number.ONE), Number.ONE).build();

		assertThat(sudoku.getContent(Position.at(Number.ONE, Number.ONE)), CoreMatchers.is(Number.ONE));
		
		Number.NUMBER_LIST.forEach(number -> {
			if (number.equals(Number.ONE)) {
				sudoku.getRow(number).stream().skip(1).forEach(
						cell -> assertThat(cell.getContent(), is(nullValue()))
				);
			} else {
				sudoku.getRow(number).forEach(cell ->
						assertThat(cell.getContent(), is(nullValue()))
				);
			}
		});
	}
	
	@Test
	void setContent() {
		Sudoku sudoku = new SudokuBuilder().build();
		
		sudoku.cell(Position.at(Number.THREE, Number.FIVE)).apply(Number.NINE);
		
		assertThat(sudoku.getContent(Position.at(Number.THREE, Number.FIVE)), CoreMatchers.is(Number.NINE));
	}

}
