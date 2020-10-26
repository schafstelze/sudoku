package de.schafstelze.model;

import de.schafstelze.model.Block;
import de.schafstelze.model.Position;
import org.junit.Test;

import java.util.List;

import static de.schafstelze.model.Number.*;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

public class BlockTest {

    @Test
    public void upperLeftIsComplete() {
        List<Position> blockUnderTest = Block.UPPER_LEFT;

        assertThat(blockUnderTest, hasItem(Position.at(ONE, ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(ONE, TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(ONE, THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(TWO, ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(TWO, TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(TWO, THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(THREE, ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(THREE, TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(THREE, THREE)));
    }

    @Test
    public void upperMiddleIsComplete() {
        List<Position> blockUnderTest = Block.UPPER_MIDDLE;

        assertThat(blockUnderTest, hasItem(Position.at(ONE, FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(ONE, FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(ONE, SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(TWO, FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(TWO, FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(TWO, SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(THREE, FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(THREE, FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(THREE, SIX)));
    }

    @Test
    public void upperRightIsComplete() {
        List<Position> blockUnderTest = Block.UPPER_RIGHT;

        assertThat(blockUnderTest, hasItem(Position.at(ONE, SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(ONE, EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(ONE, NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(TWO, SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(TWO, EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(TWO, NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(THREE, SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(THREE, EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(THREE, NINE)));
    }

    @Test
    public void middleLeftIsComplete() {
        List<Position> blockUnderTest = Block.MIDDLE_LEFT;

        assertThat(blockUnderTest, hasItem(Position.at(FOUR, ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(FOUR, TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(FOUR, THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(FIVE, ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(FIVE, TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(FIVE, THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(SIX, ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(SIX, TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(SIX, THREE)));
    }

    @Test
    public void middleMiddleIsComplete() {
        List<Position> blockUnderTest = Block.MIDDLE_MIDDLE;

        assertThat(blockUnderTest, hasItem(Position.at(FOUR, FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(FOUR, FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(FOUR, SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(FIVE, FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(FIVE, FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(FIVE, SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(SIX, FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(SIX, FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(SIX, SIX)));
    }

    @Test
    public void middleRightIsComplete() {
        List<Position> blockUnderTest = Block.MIDDLE_RIGHT;

        assertThat(blockUnderTest, hasItem(Position.at(FOUR, SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(FOUR, EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(FOUR, NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(FIVE, SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(FIVE, EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(FIVE, NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(SIX, SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(SIX, EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(SIX, NINE)));
    }

    @Test
    public void bottomLeftIsComplete() {
        List<Position> blockUnderTest = Block.BOTTOM_LEFT;

        assertThat(blockUnderTest, hasItem(Position.at(SEVEN, ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(SEVEN, TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(SEVEN, THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(EIGHT, ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(EIGHT, TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(EIGHT, THREE)));
        assertThat(blockUnderTest, hasItem(Position.at(NINE, ONE)));
        assertThat(blockUnderTest, hasItem(Position.at(NINE, TWO)));
        assertThat(blockUnderTest, hasItem(Position.at(NINE, THREE)));
    }

    @Test
    public void bottomMiddleIsComplete() {
        List<Position> blockUnderTest = Block.BOTTOM_MIDDLE;

        assertThat(blockUnderTest, hasItem(Position.at(SEVEN, FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(SEVEN, FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(SEVEN, SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(EIGHT, FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(EIGHT, FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(EIGHT, SIX)));
        assertThat(blockUnderTest, hasItem(Position.at(NINE, FOUR)));
        assertThat(blockUnderTest, hasItem(Position.at(NINE, FIVE)));
        assertThat(blockUnderTest, hasItem(Position.at(NINE, SIX)));
    }

    @Test
    public void bottomRightIsComplete() {
        List<Position> blockUnderTest = Block.BOTTOM_RIGHT;

        assertThat(blockUnderTest, hasItem(Position.at(SEVEN, SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(SEVEN, EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(SEVEN, NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(EIGHT, SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(EIGHT, EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(EIGHT, NINE)));
        assertThat(blockUnderTest, hasItem(Position.at(NINE, SEVEN)));
        assertThat(blockUnderTest, hasItem(Position.at(NINE, EIGHT)));
        assertThat(blockUnderTest, hasItem(Position.at(NINE, NINE)));
    }

}