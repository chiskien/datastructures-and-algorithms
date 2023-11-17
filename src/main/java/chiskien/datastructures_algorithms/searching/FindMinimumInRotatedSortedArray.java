package chiskien.datastructures_algorithms.searching;

public class FindMinimumInRotatedSortedArray {


    public int search(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = ((right - left) / 2) + left;
            if (nums[mid] > nums[right]) {
                //minimum must be in nums[mid + 1 : right + 1]
                left = mid + 1;
            } else {  //nums[mid] < nums[right]
                // minimum cannot be in nums[mid + 1 : right + 1]
                // it must be in nums[left, mid + 1]
                right = mid;
            }
        }
        return left;
    }
}
