package chiskien.neetcode150;

import java.util.Arrays;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (hasDuplicate(board, i, i + 1, 0, board.length)) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (hasDuplicate(board, 0, board.length, i, i + 1)) {
                return false;
            }
        }
        int regionSize = (int) Math.sqrt(board.length);
        for (int i = 0; i < regionSize; i++) {
            for (int j = 0; j < regionSize; j++) {
                if (hasDuplicate(board, regionSize * i,
                        regionSize * (i + 1),
                        regionSize * j,
                        regionSize * (j + 1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasDuplicate(char[][] board, int startRow, int endRow, int startColumn, int endColumn) {
        boolean[] isPresented = new boolean[board.length + 1];
        Arrays.fill(isPresented, false);
        for (int i = startRow; i < endRow; i++) {
            for (int j = startColumn; j < endColumn; j++) {
                char cell = board[i][j];
                if (cell != '.') {
                    if (isPresented[cell - '0']) {
                        return true;
                    } else {
                        isPresented[cell - '0'] = true;
                    }
                }
            }
        }
        return false;
    }
}
