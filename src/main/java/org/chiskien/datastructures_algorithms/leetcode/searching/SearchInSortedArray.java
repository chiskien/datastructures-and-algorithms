package org.chiskien.datastructures_algorithms.leetcode.searching;

public class SearchInSortedArray {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid;
        while (left < right) {
            mid = left + ((right - left) / 2);
            if (nums[mid] == target) return mid;
            if (nums[mid] < nums[right]) {
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            } else if (nums[mid] > nums[right]) {
                if (nums[right] < target) {
                    right = mid - 1;
                } else if (nums[right] > target) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
