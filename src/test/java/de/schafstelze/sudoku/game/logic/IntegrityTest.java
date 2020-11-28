package de.schafstelze.sudoku.game.logic;

import de.schafstelze.sudoku.model.Sudoku;
import de.schafstelze.sudoku.model.Sudoku.SudokuBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrityTest {

    @Test
    void checkIntegrityOf() {
        Sudoku sudoku = new SudokuBuilder().build();

        assertTrue(Integrity.checkIntegrityOf(sudoku));
    }

}