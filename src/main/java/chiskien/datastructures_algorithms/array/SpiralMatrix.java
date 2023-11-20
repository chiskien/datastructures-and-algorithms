package chiskien.datastructures_algorithms.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    //Adding first n-1 elements in first row, and then n-1 elements in last column
    //, n-1 last row, n-1 first column
    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralMatrix.matrixInSpiralOrderEPI(matrix));
    }

    public List<Integer> matrixInSpiralOrderEPI(int[][] matrix) {
        List<Integer> spiralSequence = new ArrayList<>();
        final int[][] SHIFT = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direction = 0;
        int x = 0; //x represents the x-axis (horizontal)
        int y = 0; //y represents the y-axis (vertical);
        for (int i = 0; i < matrix.length * matrix.length; i++) {
            spiralSequence.add(matrix[x][y]);
            matrix[x][y] = 0;
            int nextX = x + SHIFT[direction][0];
            int nextY = y + SHIFT[direction][1];
            if (nextX < 0 || nextX >= matrix.length || nextY < 0
                    || nextY >= matrix.length
                    || matrix[nextX][nextY] == 0) {
                direction = (direction + 1) % 4;
                nextX = x + SHIFT[direction][0];
                nextY = y + SHIFT[direction][1];
            }
            x = nextX;
            y = nextY;
        }
        return spiralSequence;
    }

    public List<Integer> sprialOrder(int[][] matrix) {
        List<Integer> spiralSequence = new ArrayList<>();
        for (int offset = 0; offset < Math.ceil(matrix.length * 0.5); offset++) {
            matrixLayerInClockwise(matrix, offset, spiralSequence);
        }
        return spiralSequence;
    }

    private void matrixLayerInClockwise(int[][] matrix, int offset,
                                        List<Integer> spiralSequence) {
        if (offset == matrix.length - offset - 1) {
            //square matrix has odd dimension, we are at its center
            spiralSequence.add(matrix[offset][offset]);
        }
        for (int i = offset; i < matrix.length - offset - 1; i++) {
            spiralSequence.add(matrix[offset][i]);
        }
        for (int i = offset; i < matrix.length - offset - 1; i++) {
            spiralSequence.add(matrix[i][matrix.length - offset - 1]);
        }
        for (int i = matrix.length - offset - 1; i > offset; i--) {
            spiralSequence.add(matrix[matrix.length - offset - 1][i]);
        }
        for (int i = matrix.length - offset - 1; i > offset; i--) {
            spiralSequence.add(matrix[i][offset]);

        }
    }
}
