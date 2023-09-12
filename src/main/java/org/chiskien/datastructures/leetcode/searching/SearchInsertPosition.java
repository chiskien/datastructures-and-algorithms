package org.chiskien.datastructures.leetcode.searching;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        //return index of target, if not found return the proper position
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = (high - low) / 2 + low;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
