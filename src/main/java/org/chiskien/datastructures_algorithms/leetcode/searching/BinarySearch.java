package org.chiskien.datastructures_algorithms.leetcode.searching;

public class BinarySearch {

    public int binarySearch(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int mid = (last - first) / 2 + first;
            int midValue = nums[mid];
            if (target > midValue) {
                first = mid + 1;
            } else if (target < midValue) {
                last = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
