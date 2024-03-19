package chiskien.datastructures_algorithms.searching;

/**
 * An array is said to be cyclically sorted if it is possible to cyclically shift
 * its entries so that it becomes sorted
 * <br>
 * <br>
 * Design an algorithm with time complexity {@code O(logn)}for finding the position of the
 * smallest element in a rotated sorted array.
 * Assume all elements are distinct
 *
 * @author chisk
 */
public class SearchInRotatedSortedArray {

    /**
     * @param nums   an array input, example: [4,5,6,7,8,9,10,0,1,2,3]
     * @param target the value need to search
     * @return index of target
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[left]) {
                if (target > nums[mid] || target < nums[left]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target < nums[mid] || target > nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
