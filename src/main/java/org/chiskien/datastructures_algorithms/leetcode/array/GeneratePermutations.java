package org.chiskien.datastructures_algorithms.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratePermutations {

    public static List<List<Integer>> permutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        for (int num : nums) {
            perm.add(num);
        }
        directedPermutation(0, perm, result);
        return result;
    }

    private static void directedPermutation(int i, List<Integer> perm,
                                            List<List<Integer>> result) {
        if (i == perm.size() - 1) {
            result.add(new ArrayList<>(perm));
            return;
        }
        for (int j = i; j < perm.size(); j++) {
            Collections.swap(perm, i, j);
            directedPermutation(i + 1, perm, result);
            Collections.swap(perm, i, j);
        }
    }
}
