package chiskien.datastructures_algorithms.array;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
 * Example 1:
 * <p>
 * Input: nums = [10,5,2,6], k = 100
 * Output: 8
 * Explanation: The 8 subarrays that have product less than 100 are:
 * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
 * Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
 * @author chisk
 * @since 21
 * @implNote Sliding Window, Array
 */

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        SubArrayProductLessThanK subArrayProductLessThanK = new SubArrayProductLessThanK();
        System.out.println(subArrayProductLessThanK.numArray(nums, 100));
    }

    public int numArray(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int currentProductValue = 1;
        while (i < nums.length) {
            if (j < nums.length - 1 && nums[i] < k) {
                j++;
                count++;
                currentProductValue = currentProductValue * nums[i];
            }
            while (j < nums.length && currentProductValue * nums[j] < k) {
                currentProductValue = currentProductValue * nums[j];
                j++;
                count++;
            }
            currentProductValue = nums[i];
            i++;
            j = i;
        }
        //TODO: finish this leetcode problem
        return count;
    }
}
