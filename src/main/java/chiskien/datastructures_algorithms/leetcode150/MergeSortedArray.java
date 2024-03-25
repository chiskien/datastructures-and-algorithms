package chiskien.datastructures_algorithms.leetcode150;


import java.util.Arrays;

/**
 * LeetCode 88: Merge Sorted Array
 * <br>
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * <p>
 * [1,2,3,0,0,0,0], [2,5,6] => [1,2,2,3,5,6]
 *
 * @author chisk
 * @since 21
 */

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int n = nums2.length;
        int m = 3;
        merge(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * @param nums1 array needed to be merged
     * @param nums2 the second array
     * @param m     the number of elements  in nums1 (not size of nums1)
     * @param n     the number of elements in nums2
     * @apiNote nums1.length = m + n;        nums2.length = n;
     */
    public static void merge(int[] nums1, int[] nums2, int m, int n) {
        int lastIndex = m + n - 1; //last index of nums1 because m + n = nums1.length
        while (m - 1 >= 0 && n - 1 >= 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[lastIndex] = nums1[m - 1];
                m--;
            } else {
                nums1[lastIndex] = nums2[n - 1];
                n--;
            }
            lastIndex--;
        }
        while (n > 0) {
            nums1[lastIndex--] = nums2[n - 1];
            n--;
        }
    }
}
