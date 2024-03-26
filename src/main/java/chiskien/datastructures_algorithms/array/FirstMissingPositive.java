package chiskien.datastructures_algorithms.array;


import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 41: First Missing Positive
 * <br>
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
 * <p>
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 *
 * @author chisk
 * @since 21
 */
public class FirstMissingPositive {


    public int firstMissingPositive(int[] nums) {
        //using hashmap
        //map current with the smallest positive missing
        Map<Integer, Integer> mappingCurrentWithSmallestPositive = new HashMap<>();
        int currentSmallestMissingPositive = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] >= currentSmallestMissingPositive) {
                    mappingCurrentWithSmallestPositive.put(nums[i], currentSmallestMissingPositive);
                }
                if (mappingCurrentWithSmallestPositive.containsValue(nums[i]) &&
                        !mappingCurrentWithSmallestPositive.containsKey(nums[i])) {
                    currentSmallestMissingPositive++;
                    mappingCurrentWithSmallestPositive.put(nums[i], currentSmallestMissingPositive);
                }

                //TODO: fix bugs on some edge cases
            }

        }
        return currentSmallestMissingPositive;
    }
}
