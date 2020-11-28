package de.schafstelze.sudoku.model;
import static org.hamcrest.CoreMatchers.is;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class CellTest {

	@Test
	public void immutable_cell_can_not_be_changed() {
		Cell cell = Cell.immutableWithNumber(Number.ONE);

	    assertThat(cell.apply(Number.TWO), is(Boolean.FALSE));
	    assertThat(cell.isMutable(), is(Boolean.FALSE));
	    assertThat(cell.isPossible(Number.TWO), is(Boolean.FALSE));
	}
	
	@Test
	public void mutableCellCanBeChanged() {
		Cell cell = Cell.empty();

		cell.addPossibleNumber(Number.ONE);
		assertThat(cell.isPossible(Number.ONE), is(Boolean.TRUE));
		assertThat(cell.isPossible(Number.TWO), is(Boolean.FALSE));
		
		cell.addPossibleNumber(Number.THREE);
		assertThat(cell.isPossible(Number.THREE), is(Boolean.TRUE));
		
		cell.removePossibleNumber(Number.THREE);
		assertThat(cell.isPossible(Number.THREE), is(Boolean.FALSE));
		assertThat(cell.isPossible(Number.ONE), is(Boolean.TRUE));
		
		assertThat(cell.apply(Number.ONE), is(Boolean.TRUE));
		assertThat(cell.getContent(), CoreMatchers.is(Number.ONE));
		assertThat(cell.isPossible(Number.ONE), is(Boolean.FALSE));
		assertThat(cell.isMutable(), is(Boolean.TRUE));
	}

}
