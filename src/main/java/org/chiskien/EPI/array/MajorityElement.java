package org.chiskien.EPI.array;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        System.out.println(majorityElement(nums));
    }

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
