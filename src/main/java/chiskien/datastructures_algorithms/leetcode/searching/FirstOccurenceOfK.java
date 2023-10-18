package chiskien.datastructures_algorithms.leetcode.searching;

public class FirstOccurenceOfK {


    public int searchFirstOccurenceOfK(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] > k) {
                right = mid - 1;
            } else if (nums[mid] < k) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }
        return result;
    }
}
