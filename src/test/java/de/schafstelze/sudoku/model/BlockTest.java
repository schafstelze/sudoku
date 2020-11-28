package de.schafstelze.sudoku.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class BlockTest {

    @Test
    void upperLeftIsComplete() {
        assertThat(Block.UPPER_LEFT, contains(
                Position.at(Number.ONE, Number.ONE),
                Position.at(Number.ONE, Number.TWO),
                Position.at(Number.ONE, Number.THREE),
                Position.at(Number.TWO, Number.ONE),
                Position.at(Number.TWO, Number.TWO),
                Position.at(Number.TWO, Number.THREE),
                Position.at(Number.THREE, Number.ONE),
                Position.at(Number.THREE, Number.TWO),
                Position.at(Number.THREE, Number.THREE)
        ));
    }

    @Test
    void upperMiddleIsComplete() {
        assertThat(Block.UPPER_MIDDLE, contains(
                Position.at(Number.ONE, Number.FOUR),
                Position.at(Number.ONE, Number.FIVE),
                Position.at(Number.ONE, Number.SIX),
                Position.at(Number.TWO, Number.FOUR),
                Position.at(Number.TWO, Number.FIVE),
                Position.at(Number.TWO, Number.SIX),
                Position.at(Number.THREE, Number.FOUR),
                Position.at(Number.THREE, Number.FIVE),
                Position.at(Number.THREE, Number.SIX)
        ));
    }

    @Test
    void upperRightIsComplete() {
        assertThat(Block.UPPER_RIGHT, contains(
                Position.at(Number.ONE, Number.SEVEN),
                Position.at(Number.ONE, Number.EIGHT),
                Position.at(Number.ONE, Number.NINE),
                Position.at(Number.TWO, Number.SEVEN),
                Position.at(Number.TWO, Number.EIGHT),
                Position.at(Number.TWO, Number.NINE),
                Position.at(Number.THREE, Number.SEVEN),
                Position.at(Number.THREE, Number.EIGHT),
                Position.at(Number.THREE, Number.NINE)
        ));
    }

    @Test
    void middleLeftIsComplete() {
        assertThat(Block.MIDDLE_LEFT, contains(
                Position.at(Number.FOUR, Number.ONE),
                Position.at(Number.FOUR, Number.TWO),
                Position.at(Number.FOUR, Number.THREE),
                Position.at(Number.FIVE, Number.ONE),
                Position.at(Number.FIVE, Number.TWO),
                Position.at(Number.FIVE, Number.THREE),
                Position.at(Number.SIX, Number.ONE),
                Position.at(Number.SIX, Number.TWO),
                Position.at(Number.SIX, Number.THREE)
        ));
    }

    @Test
    void middleMiddleIsComplete() {
        assertThat(Block.MIDDLE_MIDDLE, contains(
                Position.at(Number.FOUR, Number.FOUR),
                Position.at(Number.FOUR, Number.FIVE),
                Position.at(Number.FOUR, Number.SIX),
                Position.at(Number.FIVE, Number.FOUR),
                Position.at(Number.FIVE, Number.FIVE),
                Position.at(Number.FIVE, Number.SIX),
                Position.at(Number.SIX, Number.FOUR),
                Position.at(Number.SIX, Number.FIVE),
                Position.at(Number.SIX, Number.SIX)
        ));
    }

    @Test
    void middleRightIsComplete() {
        assertThat(Block.MIDDLE_RIGHT, contains(
                Position.at(Number.FOUR, Number.SEVEN),
                Position.at(Number.FOUR, Number.EIGHT),
                Position.at(Number.FOUR, Number.NINE),
                Position.at(Number.FIVE, Number.SEVEN),
                Position.at(Number.FIVE, Number.EIGHT),
                Position.at(Number.FIVE, Number.NINE),
                Position.at(Number.SIX, Number.SEVEN),
                Position.at(Number.SIX, Number.EIGHT),
                Position.at(Number.SIX, Number.NINE)
        ));
    }

    @Test
    void bottomLeftIsComplete() {
        assertThat(Block.BOTTOM_LEFT, contains(
                Position.at(Number.SEVEN, Number.ONE),
                Position.at(Number.SEVEN, Number.TWO),
                Position.at(Number.SEVEN, Number.THREE),
                Position.at(Number.EIGHT, Number.ONE),
                Position.at(Number.EIGHT, Number.TWO),
                Position.at(Number.EIGHT, Number.THREE),
                Position.at(Number.NINE, Number.ONE),
                Position.at(Number.NINE, Number.TWO),
                Position.at(Number.NINE, Number.THREE)
        ));
    }

    @Test
    void bottomMiddleIsComplete() {
        assertThat(Block.BOTTOM_MIDDLE, contains(
                Position.at(Number.SEVEN, Number.FOUR),
                Position.at(Number.SEVEN, Number.FIVE),
                Position.at(Number.SEVEN, Number.SIX),
                Position.at(Number.EIGHT, Number.FOUR),
                Position.at(Number.EIGHT, Number.FIVE),
                Position.at(Number.EIGHT, Number.SIX),
                Position.at(Number.NINE, Number.FOUR),
                Position.at(Number.NINE, Number.FIVE),
                Position.at(Number.NINE, Number.SIX)
        ));
    }

    @Test
    void bottomRightIsComplete() {
        assertThat(Block.BOTTOM_RIGHT, contains(
                Position.at(Number.SEVEN, Number.SEVEN),
                Position.at(Number.SEVEN, Number.EIGHT),
                Position.at(Number.SEVEN, Number.NINE),
                Position.at(Number.EIGHT, Number.SEVEN),
                Position.at(Number.EIGHT, Number.EIGHT),
                Position.at(Number.EIGHT, Number.NINE),
                Position.at(Number.NINE, Number.SEVEN),
                Position.at(Number.NINE, Number.EIGHT),
                Position.at(Number.NINE, Number.NINE)
        ));
    }

}