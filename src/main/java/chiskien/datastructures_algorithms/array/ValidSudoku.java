package chiskien.datastructures_algorithms.array;

import java.util.Arrays;

public class ValidSudoku {

    //time complexity: n*n
    public boolean isValidSudoku(char[][] board) {
        //check row constrains
        for (int i = 0; i < board.length; i++) {
            if (hasDuplicate(board, i, i + 1, 0, board.length)) {
                return false;
            }
        }
        //check column constrains
        for (int i = 0; i < board.length; i++) {
            if (hasDuplicate(board, 0, board.length, i, i + 1)) {
                return false;
            }
        }
        //check region constrains
        int regionSize = (int) Math.sqrt(board.length);
        for (int i = 0; i < regionSize; i++) {
            for (int j = 0; j < regionSize; j++) {
                if (hasDuplicate(board,
                        regionSize * i,
                        regionSize * (i + 1),
                        regionSize * j,
                        regionSize * (j + 1))) {
                    return false;
                }
            }
        }
        return true;
    }

    //return true if subarray partialBoard[startRow to endRow - 1][startCol to endCol -1] contains any duplicates in {1,2,..., partialBoard.length}
    //otherwise return false;
    private boolean hasDuplicate(char[][] partialBoard, int startRow, int endRow,
                                 int startCol, int endCol) {
        boolean[] isPresent = new boolean[partialBoard.length + 1];
        Arrays.fill(isPresent, false);
        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                //if the indices at row i and col j != 0 and
                char cell = partialBoard[i][j];
                if (cell != '.') {
                    if (isPresent[cell - '0']) {
                        return true;
                    } else {
                        isPresent[cell - '0'] = true;
                    }
                }
            }
        }
        return false;
    }
}
