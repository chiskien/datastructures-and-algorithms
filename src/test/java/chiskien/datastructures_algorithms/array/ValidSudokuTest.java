package chiskien.datastructures_algorithms.array;

import chiskien.datastructures_algorithms.array.ValidSudoku;
import chiskien.datastructures_algorithms.utils.BuildMatrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidSudokuTest {
    ValidSudoku validSudoku;

    @BeforeEach
    void setUp() {
        validSudoku = new ValidSudoku();
    }

    @Test
    void isValidSudoku() throws IOException {
        String fileName = "data.txt";
        assertTrue(validSudoku.isValidSudoku(
                BuildMatrix.buildMatrix(fileName, 9, 9, " ")));
    }

    @Test
    void falseCase() throws IOException {
        String fileName = "data2.txt";
        assertFalse(validSudoku.isValidSudoku(
                BuildMatrix.buildMatrix(fileName, 9, 9, " ")));
    }
}