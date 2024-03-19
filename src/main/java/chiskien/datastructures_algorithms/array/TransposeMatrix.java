package chiskien.datastructures_algorithms.array;

/**
 * Given a 2D integer array matrix, return the transpose of matrix.
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 * <p>
 * <br>
 * Example 1:
 * <br>
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * <br>
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * <p>
 * <br>
 * Example 2:
 * <br>
 * Input: matrix = [[1,2,3],[4,5,6]]
 * <br>
 * Output: [[1,4],[2,5],[3,6]]
 * <p>
 * <br>
 * Constraints:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 1000
 * 1 <= m * n <= 105
 * -109 <= matrix[i][j] <= 109
 */

public class TransposeMatrix {


    public int[][] transpose(int[][] matrix) {
        //matrix has size = int[m][n]
        int m = matrix.length; //number of rows
        int n = matrix[0].length;// number of columns
        int[][] newMatrix = new int[n][m];
        int diagonal = 0; //represent the diagonal of the matrix
        while (diagonal < newMatrix.length && diagonal < newMatrix[0].length) {
            int row = diagonal;
            int col = diagonal;
            while (row < matrix.length && col < matrix[diagonal].length) {
                newMatrix[row][diagonal] = matrix[diagonal][col];
                newMatrix[diagonal][col] = matrix[row][diagonal];
                row++;
                col++;
            }
            //fill leftover elements

            //matrix has more column than row example [[1,2,3],[4,5,6]]
            if (n > m) {
                int diff = n - m;
                while (diff-- > 0) {
                    newMatrix[row++][diagonal] = matrix[diagonal][col++];
                }
            } else {
                //matrix has more row than column example [[1,2],[3,4],[5,6]]
                int diff = m - n;
                while (diff-- > 0) {
                    newMatrix[diagonal][col++] = matrix[row++][diagonal];
                }
            }
            diagonal++;
        }
        return newMatrix;
    }
}
