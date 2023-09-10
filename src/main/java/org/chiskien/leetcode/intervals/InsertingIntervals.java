package org.chiskien.leetcode.intervals;

import java.util.ArrayList;
import java.util.List;

public class InsertingIntervals {

    public int[][] insert(int[][] disjointIntervals, int[] newInterval) {
        int i = 0;
        List<int[]> result = new ArrayList<>();

        //processing disjointIntervals in disjointIntervals which come before newInterval;
        while (i < disjointIntervals.length && newInterval[0] > disjointIntervals[i][1]) {
            result.add(disjointIntervals[i++]);
        }

        //processing disjointIntervals in disjointIntervals which overlap with newInterval
        while (i < disjointIntervals.length && newInterval[1] >= disjointIntervals[i][0]) {
            newInterval[0] = Math.min(newInterval[0], disjointIntervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], disjointIntervals[i][1]);
            i++;
        }
        result.add(newInterval);

        //adding remaining disjointIntervals to result
        while (i < disjointIntervals.length) {
            result.add(disjointIntervals[i++]);
        }
        return result.toArray(new int[0][]);
    }
}
