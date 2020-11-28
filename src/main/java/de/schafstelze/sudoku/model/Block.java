package de.schafstelze.sudoku.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		UPPER_LEFT = generateBlock(Arrays.asList(Number.ONE, Number.TWO, Number.THREE), Arrays.asList(Number.ONE, Number.TWO, Number.THREE));
		UPPER_MIDDLE = generateBlock(Arrays.asList(Number.ONE, Number.TWO, Number.THREE), Arrays.asList(Number.FOUR, Number.FIVE, Number.SIX));
		UPPER_RIGHT = generateBlock(Arrays.asList(Number.ONE, Number.TWO, Number.THREE), Arrays.asList(Number.SEVEN, Number.EIGHT, Number.NINE));
		
		MIDDLE_LEFT = generateBlock(Arrays.asList(Number.FOUR, Number.FIVE, Number.SIX), Arrays.asList(Number.ONE, Number.TWO, Number.THREE));
		MIDDLE_MIDDLE = generateBlock(Arrays.asList(Number.FOUR, Number.FIVE, Number.SIX), Arrays.asList(Number.FOUR, Number.FIVE, Number.SIX));
		MIDDLE_RIGHT = generateBlock(Arrays.asList(Number.FOUR, Number.FIVE, Number.SIX), Arrays.asList(Number.SEVEN, Number.EIGHT, Number.NINE));
		
		BOTTOM_LEFT = generateBlock(Arrays.asList(Number.SEVEN, Number.EIGHT, Number.NINE), Arrays.asList(Number.ONE, Number.TWO, Number.THREE));
		BOTTOM_MIDDLE = generateBlock(Arrays.asList(Number.SEVEN, Number.EIGHT, Number.NINE), Arrays.asList(Number.FOUR, Number.FIVE, Number.SIX));
		BOTTOM_RIGHT = generateBlock(Arrays.asList(Number.SEVEN, Number.EIGHT, Number.NINE), Arrays.asList(Number.SEVEN, Number.EIGHT, Number.NINE));
	}
	
	private static List<Position> generateBlock(final List<Number> rows, final List<Number> columns) {
		List<Position> block = new ArrayList<>();
		
		rows.forEach(row -> {
			columns.forEach(column -> {
				block.add(Position.at(row,  column));
			});
		});
		
		return block;
	}	
}
