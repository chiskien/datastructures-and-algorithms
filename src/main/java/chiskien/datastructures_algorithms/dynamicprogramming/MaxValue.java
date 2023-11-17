package chiskien.datastructures_algorithms.dynamicprogramming;

public class MaxValue {
    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue();
        int[][] matrix = new int[][]{{5, 3, 6}, {4, 10, 9}, {2, 0, 8}, {1, 5, 7}};
        System.out.println(maxValue.maxValueAfterXSteps(matrix,
                3, new int[]{0, 1}));
    }

    public int maxValueAfterXSteps(int[][] matrix, int x, int[] startingPoint) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[][] isVisited = new boolean[rows][columns];
        return maxPathSum(matrix, startingPoint[0], startingPoint[1], x, isVisited);
    }

    public int maxPathSum(int[][] matrix, int row, int col,
                          int steps, boolean[][] isVisited) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (row < 0 || row >= rows ||
                col < 0 || col >= cols || isVisited[row][col]) {
            return 0;
        }
        if (steps == 0) {
            return matrix[row][col];
        }
        isVisited[row][col] = true;
        int[] rowMoves = {1, -1, 0, 0};
        int[] colMoves = {0, 0, 1, -1};
        int maxSum = matrix[row][col];
        for (int i = 0; i < 4; i++) {
            int newRow = row + rowMoves[i];
            int newCol = col + colMoves[i];
            maxSum = Math.max(maxSum, matrix[row][col] +
                    maxPathSum(matrix, newRow, newCol, steps - 1, isVisited));
        }
        isVisited[row][col] = false;
        return maxSum;
    }

}
