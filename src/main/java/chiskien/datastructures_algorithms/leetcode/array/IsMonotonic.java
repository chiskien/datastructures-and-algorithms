package chiskien.datastructures_algorithms.leetcode.array;

public class IsMonotonic {
    public  boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = 1;

        if (nums.length == 0 || nums.length == 1 || nums.length == 2) return true;

        //skip all the equality at first
        while (nums[i] == nums[j] && j <= nums.length - 2) {
            i++;
            j++;
        }
        if (nums[i] >= nums[j]) {
            while (i <= j && j < nums.length - 1) {
                if (nums[i++] < nums[j++]) return false;
            }
        } else if (nums[i] <= nums[j]) {
            while (i <= j && j <= nums.length - 1) {
                if (nums[i++] > nums[j++]) return false;
            }
        }
        return true;
    }
}
