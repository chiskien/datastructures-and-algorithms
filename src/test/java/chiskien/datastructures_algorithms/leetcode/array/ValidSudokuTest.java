package chiskien.datastructures_algorithms.leetcode.array;

import chiskien.datastructures_algorithms.leetcode.utils.BuildMatrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {
    ValidSudoku validSudoku;
    @BeforeEach
    void setUp() {
        validSudoku = new ValidSudoku();
    }
    @Test
    void isValidSudoku() throws IOException {
        String fileName = "data.txt";
        int[][] board = BuildMatrix.buildMatrix(fileName);
        assertFalse(validSudoku.isValidSudoku(board));
    }
}