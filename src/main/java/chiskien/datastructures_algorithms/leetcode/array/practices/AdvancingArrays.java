package chiskien.datastructures_algorithms.leetcode.array.practices;

public class AdvancingArrays {

    //Jump Games
    //Write a program which takes an array of n integers, where A[i] denotes the maximum you can advance from index i, and returns whether it is possible to advance to the last index starting from the beginning of the array

    //int[]: [2,4,1,1,1,2]
    //steps[i] denotes maximum steps jump from index i

    public boolean canReachEnd(int[] steps) {
        int furthestReachSoFar = 0;
        int lastIndex = steps.length - 1;
        for (int i = 0; i <= furthestReachSoFar
                && furthestReachSoFar < lastIndex; i++) {
            furthestReachSoFar = Math.max(furthestReachSoFar, i + steps[i]);
        }
        return furthestReachSoFar >= lastIndex;
    }

    public int minimumStepToReachEnd(int[] array) {
        int furthestReactSoFar = 0;
        int lastIndex = array.length - 1;
        int minimumSteps = 0;
        int currentIndex = -1;
        for (int i = 0; i <= furthestReactSoFar && furthestReactSoFar < lastIndex; i++) {
            if (i > currentIndex) {
                minimumSteps++;
                currentIndex = furthestReactSoFar;
            }
            furthestReactSoFar = Math.max(furthestReactSoFar, i + array[i]);
        }
        return minimumSteps;
    }

}
