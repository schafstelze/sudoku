package de.schafstelze.sudoku.model;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Position position = (Position) o;

		return row == position.row &&
				column == position.column;
	}

	@Override
	public int hashCode() {
		return Objects.hash(row, column);
	}

	@Override
	public String toString() {
		return "Position{" +
				"row=" + row +
				", column=" + column +
				'}';
	}

}
