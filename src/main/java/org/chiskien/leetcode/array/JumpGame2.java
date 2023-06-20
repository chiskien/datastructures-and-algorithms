package org.chiskien.leetcode.array;

public class JumpGame2 {
    //initialized position is at nums[0]
    //return minimum jumps to reach last index
    public int minimumJumpToLast(int[] nums) {
        int count = 0;
        int furthestReachPositionSoFar = 0;
        int currentIndex = -1;
        int lastIndex = nums.length - 1;
        for (int i = 0; i <= furthestReachPositionSoFar
                && furthestReachPositionSoFar < lastIndex; i++) {
            if (i > currentIndex) {
                count++;
                currentIndex = furthestReachPositionSoFar;
            }
            furthestReachPositionSoFar = Math.max(furthestReachPositionSoFar, i + nums[i]);
        }
        return count;
    }
}
