package org.chiskien.datastructures_algorithms.leetcode.array;

public class MaximumValueAtGivenIndexInABoundedArray {


    //conditions:
    // nums.length = n;
    // nums[i] > 0 && nums[i] < n
    // abs(nums[i] - nums[i+1]) <= 1
    // nums[index] is maximized
    // sum of all elements must not exceed maxSum
    // return nums[index]
    //examples:
    /*  n = 4, index = 2, maxSum = 6;
    => nums = [1,2,2,1]
    * */
    public static int maxValue(int n, int index, int maxSum) {
        int[] nums = new int[n];
        int max = 1;
        nums[index] = maxSum - 1;
        for (int i = 0; i < n; i++) {

        }
        return nums[index];
    }
}
