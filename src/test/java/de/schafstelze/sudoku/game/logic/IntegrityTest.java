package de.schafstelze.sudoku.game.logic;

import de.schafstelze.sudoku.model.Sudoku;
import de.schafstelze.sudoku.model.Sudoku.SudokuBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegrityTest {

    @Test
    public void checkIntegrityOf() {
        Sudoku sudoku = new SudokuBuilder().build();
        assertTrue(Integrity.checkIntegrityOf(sudoku));
    }

}