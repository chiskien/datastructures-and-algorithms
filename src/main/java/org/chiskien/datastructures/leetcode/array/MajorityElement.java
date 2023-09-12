package org.chiskien.datastructures.leetcode.array;

import java.math.BigDecimal;
import java.util.Arrays;

public class MajorityElement {



    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        int i;
        for (i = 0; i < n; i++) {
            if (count > n / 2) {
                return nums[i];
            } else if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }

        }
        return nums[i];
    }
}
