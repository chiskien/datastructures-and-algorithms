package org.chiskien.datastructures.leetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputeIntersectionOfTwoSortedArray {


    public List<Integer> intersectTwoSortedArray(int[] a, int[] b) {
        List<Integer> intersectionAB = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if ((i == 0 || a[i] != a[i - 1])
                    && Arrays.binarySearch(b, a[i]) >= 0) {
                intersectionAB.add(a[i]);
            }
        }
        return intersectionAB;
    }
}
