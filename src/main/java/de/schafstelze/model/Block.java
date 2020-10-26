package de.schafstelze.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static de.schafstelze.model.Position.at;
import static de.schafstelze.model.Number.*;

public class Block {

	public static final List<Position> UPPER_LEFT;
	public static final List<Position> UPPER_MIDDLE;
	public static final List<Position> UPPER_RIGHT;
	public static final List<Position> MIDDLE_LEFT;
	public static final List<Position> MIDDLE_MIDDLE;
	public static final List<Position> MIDDLE_RIGHT;
	public static final List<Position> BOTTOM_LEFT;
	public static final List<Position> BOTTOM_MIDDLE;
	public static final List<Position> BOTTOM_RIGHT;
	
	static {
		UPPER_LEFT = generateBlock(Arrays.asList(ONE, TWO, THREE), Arrays.asList(ONE, TWO, THREE));
		UPPER_MIDDLE = generateBlock(Arrays.asList(ONE, TWO, THREE), Arrays.asList(FOUR, FIVE, SIX));
		UPPER_RIGHT = generateBlock(Arrays.asList(ONE, TWO, THREE), Arrays.asList(SEVEN, EIGHT, NINE));
		
		MIDDLE_LEFT = generateBlock(Arrays.asList(FOUR, FIVE, SIX), Arrays.asList(ONE, TWO, THREE));
		MIDDLE_MIDDLE = generateBlock(Arrays.asList(FOUR, FIVE, SIX), Arrays.asList(FOUR, FIVE, SIX));
		MIDDLE_RIGHT = generateBlock(Arrays.asList(FOUR, FIVE, SIX), Arrays.asList(SEVEN, EIGHT, NINE));
		
		BOTTOM_LEFT = generateBlock(Arrays.asList(SEVEN, EIGHT, NINE), Arrays.asList(ONE, TWO, THREE));
		BOTTOM_MIDDLE = generateBlock(Arrays.asList(SEVEN, EIGHT, NINE), Arrays.asList(FOUR, FIVE, SIX));
		BOTTOM_RIGHT = generateBlock(Arrays.asList(SEVEN, EIGHT, NINE), Arrays.asList(SEVEN, EIGHT, NINE));
	}
	
	private static List<Position> generateBlock(final List<Number> rows, final List<Number> columns) {
		List<Position> block = new ArrayList<>();
		
		rows.forEach(row -> {
			columns.forEach(column -> {
				block.add(at(row,  column));
			});
		});
		
		return block;
	}	
}
