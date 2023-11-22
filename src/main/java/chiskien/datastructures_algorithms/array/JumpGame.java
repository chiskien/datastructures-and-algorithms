package chiskien.datastructures_algorithms.array;

public class JumpGame {

    //Jump Games
    //Write a program which takes an array of n integers, where A[i] denotes the maximum you can advance from index i, and returns whether it is possible to advance to the last index starting from the beginning of the array

    //int[]: [2,4,1,1,1,2]
    //steps[i] denotes maximum steps jump from index i
    public static boolean canJump(int[] nums) {
        int furthestReachSoFar = 0;
        int lastIndex = nums.length - 1;
        for (int i = 0; i <= furthestReachSoFar &&
                furthestReachSoFar < lastIndex; i++) {
            //the furthest index can jump is i + nums[i]
            furthestReachSoFar = Math.max(furthestReachSoFar, i + nums[i]);
        }
        return furthestReachSoFar >= lastIndex;
    }
}
