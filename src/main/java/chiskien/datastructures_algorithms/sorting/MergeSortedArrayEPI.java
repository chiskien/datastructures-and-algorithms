package chiskien.datastructures_algorithms.sorting;

public class MergeSortedArrayEPI {


    public void mergeTwoSortedArrays(int[] nums1, int m, int[] nums2, int n) {
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
