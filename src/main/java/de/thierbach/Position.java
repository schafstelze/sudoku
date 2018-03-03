package de.thierbach;

public class Position {

	private final Number row;
	private final Number column;
	
	private Position(final Number row, final Number column) {
		this.row = row;
		this.column = column;
	}
	
	public static Position at(final Number row, final Number column) {
		return new Position(row, column);
	}

	public Number getRow() { return row; }
	public Number getColumn() { return column; }
	
}
