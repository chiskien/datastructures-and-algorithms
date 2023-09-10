package org.chiskien.leetcode.intervals;

import java.util.Arrays;

public class MergeIntervals {

    public void merge(int[][] intervals) {
        int i = 0;
        while (i < intervals.length - 1 && intervals[i + 1][0] < intervals[i][1]) {
            intervals[i][1] = intervals[i + 1][1];
            i++;
        }
    }
}
