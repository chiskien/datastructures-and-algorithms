package chiskien.datastructures_algorithms.array;

public class MergeTwoSortedArray {


    // assumptions: nums1.length = m + n;
    public static void solution(int[] nums1, int m, int[] nums2, int n) {
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

    public void mergeTwoSortedArraysEPI(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1, b = n - 1;
        int pivot = m + n - 1; //m + n == nums2.length
        while (a >= 0 && b >= 0) {
            if (nums1[a] > nums2[b]) {
                nums1[pivot] = nums1[a--];
            } else {
                nums1[pivot] = nums2[b--];
            }
            pivot--;
        }
        while (b >= 0) {
            nums1[pivot--] = nums2[b--];

        }
    }
}
