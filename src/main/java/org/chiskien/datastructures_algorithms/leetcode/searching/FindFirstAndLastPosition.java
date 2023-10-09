package org.chiskien.datastructures_algorithms.leetcode.searching;

public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }

    public int findFirst(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int startingIndex = -1;
        while (first <= last) {
            int mid = (last - first) / 2 + first;
            if (nums[mid] > target) {
                last = mid - 1;
            } else if (nums[mid] < target) {
                first = mid + 1;
            } else {
                startingIndex = mid;
                last = mid - 1;
            }
        }
        return startingIndex;
    }

    public int findLast(int[] nums, int target) {
        int endingIndex = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                endingIndex = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return endingIndex;
    }
}