package org.chiskien.leetcode.array;

public class JumpGame {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 1, 1, 4};
        int[] b = new int[]{3, 2, 1, 0, 4};
        System.out.println(canJump(a));
    }

    public static boolean canJump(int[] nums) {
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            if (step < i) return false;
            step = Math.max(step, i + nums[i]);
        }
        return true;
    }
}
