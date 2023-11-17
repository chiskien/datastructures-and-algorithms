package chiskien.datastructures_algorithms.searching;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{1, 2, 3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] dummy1 = nums1;
        int[] dummy2 = nums2;
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;


        if (n < m) {
            dummy2 = nums1;
            dummy1 = nums2;
        }

        int half = totalLength / 2;

        int left = 0, right = dummy1.length - 1;
        int i, j;
        while (true) {
            i = (right - left) / 2 + left;
            j = half - i - 2;
            int dummy1Left = (i >= 0) ? dummy1[i] : Integer.MIN_VALUE;
            int dummy1Right = (i + 1 < dummy1.length) ? dummy1[i + 1] : Integer.MAX_VALUE;
            int dummy2Left = (j >= 0) ? dummy2[j] : Integer.MIN_VALUE;
            int dummy2Right = (j + 1 < dummy2.length) ? dummy2[j + 1] : Integer.MAX_VALUE;

            if (dummy1Left <= dummy2Right && dummy2Left <= dummy1Right) {
                if (totalLength % 2 == 0) {
                    return Math.min(dummy1Right, dummy2Right);
                } else {
                    return (double) (Math.max(dummy1Left, dummy2Left) + Math.min(dummy1Right, dummy2Right)) / 2;
                }
            } else if (dummy1Left > dummy2Right) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }

    }
}
