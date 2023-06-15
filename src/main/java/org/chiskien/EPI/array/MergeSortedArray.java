package org.chiskien.EPI.array;

public class MergeSortedArray {
    public static void main(String[] args) {

    }

    // assumptions: nums1.length = m + n;
    public static void solution(int[] nums1, int m, int[] nums2, int n) {
        // nums1.length = m + n;
        int lastIndex = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums2[n - 1] > nums1[m - 1]) {
                nums1[lastIndex] = nums2[n - 1];
                n--;
            } else {
                nums1[lastIndex] = nums1[m - 1];
                m--;
            }
            lastIndex--;
        }
        while (n > 0) {
            nums1[lastIndex] = nums2[n - 1];
            n--;
            lastIndex--;
        }
    }
}
