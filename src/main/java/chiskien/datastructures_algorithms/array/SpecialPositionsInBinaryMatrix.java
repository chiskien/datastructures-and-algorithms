package chiskien.datastructures_algorithms.array;

public class SpecialPositionsInBinaryMatrix {

    //Given an m x n binary matrix mat, return the number of special positions in mat.
    //A position (i, j) is called special if mat[i][j] == 1, and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
    public int numSpecial(int[][] mat) {
        int count = 0;
        int[] col = new int[mat[0].length];
        for (int[] row : mat) {
            int before = -1;
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 1) {
                    col[j]++;
                    if (before != -1) {
                        col[before]++;
                        col[j]++;
                    }
                    before = j;
                }
            }
        }
        for (int num : col) {
            if (num == 1) {
                count += 1;
            }
        }
        return count;
    }
}
