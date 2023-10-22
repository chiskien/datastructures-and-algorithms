package leetcode.array;

import chiskien.datastructures_algorithms.leetcode.array.ValidSudoku;
import chiskien.datastructures_algorithms.leetcode.utils.BuildMatrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

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
        int[][] board = BuildMatrix.buildMatrix(fileName,9,9, " ");

        assertTrue(validSudoku.isValidSudoku(board));
    }
    @Test
    void falseCase() throws IOException {
        String fileName = "data2.txt";
        int[][] board = BuildMatrix.buildMatrix(fileName,9,9, " ");

        assertFalse(validSudoku.isValidSudoku(board));
    }
}