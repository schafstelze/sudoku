package de.schafstelze;

import static org.junit.Assert.*;

import static de.schafstelze.Position.at;
import static de.schafstelze.Number.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.nullValue;
import org.junit.Test;

import de.schafstelze.Sudoku.SudokuBuilder;

public class SudokuBuilderTest {

	@Test
	public void buildReturnsSudokuWithEmptyCells() {
		Sudoku sudoku = new SudokuBuilder().build();
		
		NUMBER_LIST.forEach(
				number -> sudoku.getRow(number).forEach(
						cell -> assertThat(cell.getContent(), is(nullValue()))
				));
	}

	@Test
	public void addStaticCellAndBuild() {
		Sudoku sudoku = new SudokuBuilder().addStaticCell(at(ONE, ONE), ONE).build();

		assertThat(sudoku.getContent(at(ONE, ONE)), is(ONE));
		
		NUMBER_LIST.forEach(number -> {
			if (number.equals(ONE)) {
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
	public void setContent() {
		Sudoku sudoku = new SudokuBuilder().build();
		
		sudoku.cell(at(THREE, FIVE)).apply(NINE);
		
		assertThat(sudoku.getContent(at(THREE, FIVE)), is(NINE));
	}

}
