package chiskien.datastructures_algorithms.leetcode.dynamicprogramming;

public class MaximumSubArray {

    //Dynamic Programming Approach
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int minSum = Integer.MAX_VALUE, sum = 0, maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
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
