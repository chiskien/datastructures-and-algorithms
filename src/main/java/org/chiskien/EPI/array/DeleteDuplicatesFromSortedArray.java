package org.chiskien.EPI.array;

/*
 Delete duplicates from a sorted array
 Example:
 [1,2,4,5,7,9,11,11,11,12] -> [1,2,4,5,7,9,12, 0,0,0]
* */
public class DeleteDuplicatesFromSortedArray {

    public static void main(String[] args) {
//        int[] A = new int[]{1, 2, 4, 5, 5, 7, 9, 11, 11, 11, 12};
//        System.out.println(solutionVariant1(A, 5));
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicateAtMost2(nums));
    }

    public static int[] solution(int[] A) {
        int j = 1;
        for (int i = 1; i < A.length; i++) {
            int a = A[i];
            int b = A[j - 1];
            if (a != b) {
                A[j++] = A[i]; //compare to
            }
        }
        return A;
    }

    // remove all occurrences of key,
    // remaining elements have been shifted left to fill
    //return the number of remaining elements
    public static int solutionVariant1(int[] A, int key) {
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != key) {
                A[k++] = A[i];
            }
        }
        return k;
    }


    //Write a program which takes as input a sorted array A of
    // integers and a positive integer m,and updates A
    // so that if x appears m times in A, it appears exactly min(2,m) times in A.
    // The update to A should be performed in one pass,
    // and no additional storage may be allocated.
    public static int[] solutionVariant2(int[] A, int m) {
        return A;
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
