package chiskien.datastructures_algorithms.leetcode.array;

//Rotate (2D array)/matrix
public class RotateImage {


    public void rotate(int[][] matrix) {
        int lastIndex = matrix.length - 1;
        for (int i = 0; i < (matrix.length / 2); i++) {
            for (int j = i; j < lastIndex - i; j++) {
                //Perform 4 ways exchange
                int temp1 = matrix[lastIndex - j][i];
                int temp2 = matrix[lastIndex - i][lastIndex - j];
                int temp3 = matrix[j][lastIndex - i];
                int temp4 = matrix[i][j];
                matrix[i][j] = temp1;
                matrix[lastIndex - j][i] = temp2;
                matrix[lastIndex - i][lastIndex - j] = temp3;
                matrix[j][lastIndex - i] = temp4;
            }
        }
    }
}
