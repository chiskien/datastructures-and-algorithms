package org.chiskien.datastructures.leetcode.slidingwindows;

import java.util.Map;

public class MinimumSizeSubArraySum {

    public int minSubArrayLen(int[] nums, int target) {

        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        int currentSum = 0;
        while (right < nums.length) {
            currentSum += nums[right++];
            while (currentSum >= target) {
                min = Math.min(min, right - left);
                currentSum -= nums[left++];
            }
        }
        if (min == Integer.MAX_VALUE) return 0;
        return min;
    }
}
