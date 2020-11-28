package de.schafstelze.sudoku.model;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

public class BlockTest {

    @Test
    public void upperLeftIsComplete() {
        List<Position> blockUnderTest = Block.UPPER_LEFT;

        assertThat(blockUnderTest, hasItem(Position.at(Number.ONE, Number.ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.ONE, Number.TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.ONE, Number.THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.TWO, Number.ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.TWO, Number.TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.TWO, Number.THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.THREE, Number.ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.THREE, Number.TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.THREE, Number.THREE)));
    }

    @Test
    public void upperMiddleIsComplete() {
        List<Position> blockUnderTest = Block.UPPER_MIDDLE;

        assertThat(blockUnderTest, hasItem(Position.at(Number.ONE, Number.FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.ONE, Number.FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.ONE, Number.SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.TWO, Number.FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.TWO, Number.FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.TWO, Number.SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.THREE, Number.FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.THREE, Number.FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.THREE, Number.SIX)));
    }

    @Test
    public void upperRightIsComplete() {
        List<Position> blockUnderTest = Block.UPPER_RIGHT;

        assertThat(blockUnderTest, hasItem(Position.at(Number.ONE, Number.SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.ONE, Number.EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.ONE, Number.NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.TWO, Number.SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.TWO, Number.EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.TWO, Number.NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.THREE, Number.SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.THREE, Number.EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.THREE, Number.NINE)));
    }

    @Test
    public void middleLeftIsComplete() {
        List<Position> blockUnderTest = Block.MIDDLE_LEFT;

        assertThat(blockUnderTest, hasItem(Position.at(Number.FOUR, Number.ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FOUR, Number.TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FOUR, Number.THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FIVE, Number.ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FIVE, Number.TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FIVE, Number.THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SIX, Number.ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SIX, Number.TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SIX, Number.THREE)));
    }

    @Test
    public void middleMiddleIsComplete() {
        List<Position> blockUnderTest = Block.MIDDLE_MIDDLE;

        assertThat(blockUnderTest, hasItem(Position.at(Number.FOUR, Number.FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FOUR, Number.FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FOUR, Number.SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FIVE, Number.FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FIVE, Number.FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FIVE, Number.SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SIX, Number.FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SIX, Number.FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SIX, Number.SIX)));
    }

    @Test
    public void middleRightIsComplete() {
        List<Position> blockUnderTest = Block.MIDDLE_RIGHT;

        assertThat(blockUnderTest, hasItem(Position.at(Number.FOUR, Number.SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FOUR, Number.EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FOUR, Number.NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FIVE, Number.SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FIVE, Number.EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.FIVE, Number.NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SIX, Number.SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SIX, Number.EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SIX, Number.NINE)));
    }

    @Test
    public void bottomLeftIsComplete() {
        List<Position> blockUnderTest = Block.BOTTOM_LEFT;

        assertThat(blockUnderTest, hasItem(Position.at(Number.SEVEN, Number.ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SEVEN, Number.TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SEVEN, Number.THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.EIGHT, Number.ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.EIGHT, Number.TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.EIGHT, Number.THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.NINE, Number.ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.NINE, Number.TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.NINE, Number.THREE)));
    }

    @Test
    public void bottomMiddleIsComplete() {
        List<Position> blockUnderTest = Block.BOTTOM_MIDDLE;

        assertThat(blockUnderTest, hasItem(Position.at(Number.SEVEN, Number.FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SEVEN, Number.FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SEVEN, Number.SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.EIGHT, Number.FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.EIGHT, Number.FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.EIGHT, Number.SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.NINE, Number.FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.NINE, Number.FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.NINE, Number.SIX)));
    }

    @Test
    public void bottomRightIsComplete() {
        List<Position> blockUnderTest = Block.BOTTOM_RIGHT;

        assertThat(blockUnderTest, hasItem(Position.at(Number.SEVEN, Number.SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SEVEN, Number.EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.SEVEN, Number.NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.EIGHT, Number.SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.EIGHT, Number.EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.EIGHT, Number.NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.NINE, Number.SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.NINE, Number.EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(Number.NINE, Number.NINE)));
    }

}