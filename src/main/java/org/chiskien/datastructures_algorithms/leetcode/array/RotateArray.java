package org.chiskien.datastructures_algorithms.leetcode.array;

public class RotateArray {


    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (k != 0) {
            k = k % length;
        }
        for (int i = 0; i < k; i++) {
            int last = nums[length - 1];
            int j;
            for (j = length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = last;
        }
    }
}
