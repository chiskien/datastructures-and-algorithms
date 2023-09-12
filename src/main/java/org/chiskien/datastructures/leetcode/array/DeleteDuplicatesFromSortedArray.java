package org.chiskien.datastructures.leetcode.array;

/*
 Delete duplicates from a sorted array
 Example:
 [1,2,4,5,7,9,11,11,11,12] -> [1,2,4,5,7,9,12, 0,0,0]
* */
public class DeleteDuplicatesFromSortedArray {


    public static int[] solution(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i];
            int b = nums[j - 1];
            if (a != b) {
                nums[j++] = nums[i]; //compare to
            }
        }
        return nums;
    }

    // remove all occurrences of key,
    // remaining elements have been shifted left to fill
    //return the number of remaining elements
    public static int solutionVariant1(int[] nums, int key) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != key) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }


    //Write a program which takes as input a sorted array nums of
    // integers and a positive integer m,and updates nums
    // so that if x appears m times in nums, it appears exactly min(2,m) times in nums.
    // The update to nums should be performed in one pass,
    // and no additional storage may be allocated.
    public static int[] solutionVariant2(int[] nums, int m) {
        return nums;
    }


    /*
     * Given an integer array nums sorted in non-decreasing order,
     * remove some duplicates in-place such that each unique element appears at most twice.
     * The relative order of the elements should be kept the same
     * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
     * It does not matter what you leave beyond the first k elements.*/

    public static int removeDuplicateAtMost2(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
