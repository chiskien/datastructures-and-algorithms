package chiskien.datastructures_algorithms.leetcode.array;

import java.util.Arrays;
import java.util.Collections;

public class ValidSudoku {
    //using recursion
    public boolean isValidSudoku(int[][] board) {
        //check row constrains
        for (int i = 0; i < board.length; i++) {
            if (hasDuplicate(board,i,i+1,0,board.length)) {
                return false;
            }
        }
        //check column constrains
        for (int i = 0; i < board.length; i++) {
            if (hasDuplicate(board, 0, board.length, i , i+1)) {
                return false;
            }
        }
        //check region constrains
        int regionSize = (int) Math.sqrt(board.length);
        for (int i = 0; i < regionSize; i++) {
            for (int j = 0; j < regionSize; j++) {
                if (hasDuplicate(board, regionSize * i,
                        regionSize * (i+1), regionSize * j,
                        regionSize * (j+1))) {
                    return false;
                }
            }
        }
        return true;
    }

    //return true if subarray partialBoard[startRow to endRow - 1][startCol to endCol -1] contains any duplicates in {1,2,..., partialBoard.length}
    //otherwise return false;
    private boolean hasDuplicate(int[][] partialBoard, int startRow, int endRow,
                                 int startCol, int endCol) {
        boolean[] isPresent = new boolean[partialBoard.length + 1];
        Arrays.fill(isPresent, false);
        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol ; j++) {
                //if the indices at row i and col j != 0 and
                int num = partialBoard[i][j];
                if (num != 0 && isPresent[num]) {
                    return true;
                }
                isPresent[num] = true;
            }
        }
        return false;
    }
}
