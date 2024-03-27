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
 * @implNote HashMap, Arrays
 */
public class FirstSmallestMissingPositive {


    public int firstMissingPositive(int[] nums) {
        //using hashmap
        //map current with the smallest positive missing

        int currentSmallestMissingPositive = 1;
        Map<Integer, Integer> mappingBetweenCurrentAndSmallestNumber = new HashMap<>();
        for (int num : nums) {
            if (num > 0) {
                if (num > currentSmallestMissingPositive) {
                    mappingBetweenCurrentAndSmallestNumber.put(num, currentSmallestMissingPositive);
                } else if (num == currentSmallestMissingPositive) {
                    if (!mappingBetweenCurrentAndSmallestNumber.containsKey(num)) {
                        currentSmallestMissingPositive++;
                    }
                    while (mappingBetweenCurrentAndSmallestNumber.containsKey(currentSmallestMissingPositive)) {
                        currentSmallestMissingPositive++;
                    }
                    mappingBetweenCurrentAndSmallestNumber.put(num, currentSmallestMissingPositive);
                }
            }
        }
        return currentSmallestMissingPositive;
    }

    public int find(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int next = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[next]) {
                int temp = nums[i];
                nums[i] = nums[next];
                nums[next] = temp;
            } else {
                i++;
            }

        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        return nums.length + 1;

    }
}
