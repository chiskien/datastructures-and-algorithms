package org.chiskien.datastructures.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {


    static int fibonacci(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int num : nums) {
            if (integers.contains(num)) {
                return true;
            } else {
                integers.add(num);
            }
        }
        return false;
    }
}
