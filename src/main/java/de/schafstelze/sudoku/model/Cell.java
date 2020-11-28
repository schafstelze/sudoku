package de.schafstelze.sudoku.model;
import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

public class Cell {

	private Number content;
	private final boolean mutable;
	private final Set<Number> possibleNumbers;
	
	private Cell(final boolean mutable, final Number content) {
		this.mutable = mutable;
		this.content = content;
		if (mutable) {
			possibleNumbers = new HashSet<>();
		} else {
			possibleNumbers = ImmutableSet.<Number>of();
		}
	}

	public static Cell immutableWithNumber(final Number content) {
		return new Cell(false, content);
	}
	
	public static Cell empty() {
		return new Cell(true, null);
	}

	public Number getContent() {
		return content;
	}

	public boolean apply(Number content) {
		if (mutable) { 
			this.content = content;
			possibleNumbers.clear();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isMutable() { return mutable; }
	public void addPossibleNumber(final Number number) { possibleNumbers.add(number); }
	public void removePossibleNumber(final Number number) { possibleNumbers.remove(number); }	
	public boolean isPossible(final Number number) { return possibleNumbers.contains(number); }
}
