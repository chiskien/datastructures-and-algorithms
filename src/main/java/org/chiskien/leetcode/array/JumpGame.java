package org.chiskien.leetcode.array;

public class JumpGame {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 1, 1, 4};
        System.out.println(canJump(a));
    }

    public static boolean canJump(int[] nums) {
        int furthestReachSoFar = 0;
        int lastIndex = nums.length - 1;
        for (int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastIndex; i++) {
            //the furthest index can jump is i + nums[i]
            furthestReachSoFar = Math.max(furthestReachSoFar, i + nums[i]);
        }
        return furthestReachSoFar >= lastIndex;
    }
}