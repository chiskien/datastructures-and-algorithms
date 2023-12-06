package chiskien.datastructures_algorithms.searching;

public class SearchInRotatedSortedArray {


    //An array is said to be cyclically sorted if it is possible to cyclically shift
    // its entries so that it becomes sorted

    //Design an algorithm with time complexity O(logn) for finding the position of the
    // smallest element in a rotated sorted array.
    // Assume all elements are distinct

    //Example: [4,5,6,7,8,9,10,0,1,2,3], target = 2;
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
