package de.schafstelze.model;
import static org.junit.Assert.*;
import static de.schafstelze.model.Number.*;
import static org.hamcrest.CoreMatchers.is;

import de.schafstelze.model.Cell;
import org.junit.Test;

public class CellTest {

	@Test
	public void immutable_cell_can_not_be_changed() {
		Cell cell = Cell.immutableWithNumber(ONE);

	    assertThat(cell.apply(TWO), is(Boolean.FALSE));
	    assertThat(cell.isMutable(), is(Boolean.FALSE));
	    assertThat(cell.isPossible(TWO), is(Boolean.FALSE));
	}
	
	@Test
	public void mutableCellCanBeChanged() {
		Cell cell = Cell.empty();

		cell.addPossibleNumber(ONE);
		assertThat(cell.isPossible(ONE), is(Boolean.TRUE));
		assertThat(cell.isPossible(TWO), is(Boolean.FALSE));
		
		cell.addPossibleNumber(THREE);
		assertThat(cell.isPossible(THREE), is(Boolean.TRUE));
		
		cell.removePossibleNumber(THREE);
		assertThat(cell.isPossible(THREE), is(Boolean.FALSE));
		assertThat(cell.isPossible(ONE), is(Boolean.TRUE));
		
		assertThat(cell.apply(ONE), is(Boolean.TRUE));
		assertThat(cell.getContent(), is(ONE));
		assertThat(cell.isPossible(ONE), is(Boolean.FALSE));
		assertThat(cell.isMutable(), is(Boolean.TRUE));
	}

}
