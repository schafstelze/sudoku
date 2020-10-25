package de.schafstelze;
import java.util.Arrays;
import java.util.List;

public enum Number {

	ONE("1"),
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9");

	private final String integerValue;

	Number(String integerValue) {
		this.integerValue = integerValue;
	}

	public String asInteger() {
		return this.integerValue;
	}

	public static final List<Number> NUMBER_LIST = Arrays.asList(Number.values());
}
