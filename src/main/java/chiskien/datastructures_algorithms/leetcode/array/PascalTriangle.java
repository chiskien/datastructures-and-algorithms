package chiskien.datastructures_algorithms.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j > 0 && j < i) {
                    currentRow.add(pascalTriangle.get(i - 1).get(j - 1) +
                            pascalTriangle.get(i - 1).get(j));
                } else {
                    currentRow.add(1);
                }
            }
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle;
    }
}
