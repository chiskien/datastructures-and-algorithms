package org.chiskien.leetcode.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {


    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i];
        }
        int left = 1;
        for (int i = n - 2; i >= 0; i--) {
            result[i] *= left;
            left *= nums[i+1];
        }
        return result;
    }
}
