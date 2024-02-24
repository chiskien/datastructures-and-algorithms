package chiskien.datastructures_algorithms.leetcode150;


/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

//[1,2,3,0,0,0,0], [2,5,6] => [1,2,2,3,5,6]

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 4, 0, 0, 0}, new int[]{3, 5, 6}, 4, 3);
    }

    public static void merge(int[] nums1, int[] nums2, int m, int n) {
        if ((m + n) != nums1.length) throw new IllegalArgumentException("The value m + n must equal the nums1 length");
        if (n != nums2.length) throw new IllegalArgumentException("The value n must equal the nums2 length");
        int lastIndex = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m-1] > nums2[n-1]) {

            }
        }
    }
}
