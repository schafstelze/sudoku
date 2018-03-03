package de.thierbach;

import static org.junit.Assert.*;

import static de.thierbach.Position.at;
import static de.thierbach.Number.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.nullValue;
import org.junit.Test;

import de.thierbach.Sudoku.SudokuBuilder;

public class SudokuBuilderTest {

	@Test
	public void buildReturnsSudokuWithEmptyCells() {
		Sudoku sudoku = new SudokuBuilder().build();
		
		NUMBER_LIST.stream().forEach(number -> {
			sudoku.getRow(number).stream().forEach(cell -> {
				assertThat(cell.getContent(), is(nullValue()));
			});
		});
	}

	@Test
	public void addStaticCellAndBuild() {
		Sudoku sudoku = new SudokuBuilder().addStaticCell(at(ONE, ONE), ONE).build();

		assertThat(sudoku.getContent(at(ONE, ONE)), is(ONE));
		
		NUMBER_LIST.stream().forEach(number -> {
			if (number.equals(ONE)) {
				sudoku.getRow(number).stream().skip(1).forEach(cell -> {
					assertThat(cell.getContent(), is(nullValue()));
				});
			} else {
				sudoku.getRow(number).stream().forEach(cell -> {
					assertThat(cell.getContent(), is(nullValue()));
				});
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
