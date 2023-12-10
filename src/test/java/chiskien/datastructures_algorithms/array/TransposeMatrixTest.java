package chiskien.datastructures_algorithms.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {
    TransposeMatrix transposeMatrix;

    @BeforeEach
    void setUp() {
        transposeMatrix = new TransposeMatrix();
    }

    @Test
    void squareMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertArrayEquals(expected, transposeMatrix.transpose(matrix));
    }

    @Test
    void rowGreaterThanColumn1() {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] expected = {{1, 3, 5, 7}, {2, 4, 6, 8}};
        assertArrayEquals(expected, transposeMatrix.transpose(matrix));
    }

    @Test
    void rowGreaterThanColumn2() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] expected = {{1, 4, 7, 10}, {2, 5, 8, 11}, {3, 6, 9, 12}};
        assertArrayEquals(expected, transposeMatrix.transpose(matrix));
    }

    @Test
    void columnGreaterThanRow1() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] expected = {{1, 5}, {2, 6}, {3, 7}, {4, 8}};
        assertArrayEquals(expected, transposeMatrix.transpose(matrix));
    }
}