package org.chiskien.datastructures_algorithms.leetcode.dynamicprogramming;

public class MaximumSubArray {

    //Dynamic Programming Approach
    public int maxSubArray(int[] nums) {
        int minSum = 0, sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < minSum) {
                minSum = sum;
            }
            if (sum - minSum > maxSum) {
                maxSum = sum - minSum;
            }
        }
        return maxSum;
    }
}
