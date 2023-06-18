package org.chiskien.EPI.binarysearch;

public class BinarySearch {

    public int binarySearch(int[] nums, int value) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == value) {
                return mid;
            } else if (value > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
