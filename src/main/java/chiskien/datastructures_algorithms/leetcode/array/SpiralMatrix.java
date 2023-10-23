package chiskien.datastructures_algorithms.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    //Adding first n-1 elements in first row, and then n-1 elements in last column
    //, n-1 last row, n-1 first column
    public List<Integer> sprialOrder(int[][] matrix) {
        List<Integer> spiralSequence = new ArrayList<>();
        for (int offset = 0; offset < Math.ceil(matrix.length * 0.5); offset++) {
            matrixLayerInClockwise( matrix  , offset, spiralSequence);
        }
        return spiralSequence;
    }

    private void matrixLayerInClockwise(int[][] matrix, int offset,
                                        List<Integer> spiralSequence) {
        if (offset== matrix.length - offset - 1) {
            //square matrix has odd dimension, we are at its center
            spiralSequence.add(matrix[offset][offset]);
        }
        for (int i = offset; i < matrix.length - offset - 1; i++) {
            spiralSequence.add(matrix[offset][i]);
        }
        for (int i = offset; i < matrix.length - offset- 1; i++) {
            spiralSequence.add(matrix[i][matrix.length-offset-1]);
        }
        for (int i = matrix.length - offset -1; i > offset ; i--) {
            spiralSequence.add(matrix[matrix.length-offset-1][i]);
        }
        for (int i = matrix.length - offset - 1; i > offset; i--) {
            spiralSequence.add(matrix[i][offset]);

        }
    }
}
