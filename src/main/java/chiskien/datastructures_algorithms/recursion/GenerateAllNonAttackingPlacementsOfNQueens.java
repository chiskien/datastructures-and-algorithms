package chiskien.datastructures_algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllNonAttackingPlacementsOfNQueens {


    public List<List<Integer>> nQueens(int n) {
        List<List<Integer>> result = new ArrayList<>();
        solveNQueens(n, 0, new ArrayList<>(), result);
        return result;
    }

    private void solveNQueens(int n, int row, List<Integer> columnPlacement, List<List<Integer>> result) {
        if (row == n) {
            //All queens are legally placed
            result.add(new ArrayList<>(columnPlacement));
        } else {
            for (int col = 0; col < n; col++) {
                columnPlacement.add(col);
                if (isValid(columnPlacement)) {
                    solveNQueens(n, row + 1, columnPlacement, result);
                }

                columnPlacement.remove(columnPlacement.size() - 1);
            }
        }
    }

    private boolean isValid(List<Integer> columnPlacement) {
        int rowId = columnPlacement.size() - 1;
        for (int i = 0; i < rowId; i++) {
            int diff = Math.abs(columnPlacement.get(i) - columnPlacement.get(rowId));
            if (diff == 0 || diff == rowId - 1) {
                return false;
            }
        }
        return true;
    }
}
