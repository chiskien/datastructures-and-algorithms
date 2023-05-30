package org.chiskien.EPI.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

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
