package org.chiskien.datastructures_algorithms.leetcode.intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            while ((j < nums.length - 1) && (nums[j] + 1 == nums[j + 1])) {
                j++;
            }
            if (i == j) {
                result.add(String.valueOf(nums[i]));
            } else {
                String str = nums[i] + "->" + nums[j];
                result.add(str);
            }
            i = ++j;
        }
        return result;
    }
}
