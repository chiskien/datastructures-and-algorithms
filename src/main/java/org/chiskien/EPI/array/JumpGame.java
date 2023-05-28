package org.chiskien.EPI.array;

public class JumpGame {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 1, 1, 4};
        int[] b = new int[]{3, 2, 1, 0 , 4};
        System.out.println(canJump(b));
    }

    public static boolean canJump(int[] nums) {
        boolean canJump = false;
        int i = 0;
        while (i <= nums.length) {
            if (nums[i] == 0) {
                break;
            }
            i += nums[i];
            if (i == nums.length - 1) {
                canJump = true;
                break;
            }
        }
        return canJump;
    }
}
