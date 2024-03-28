package chiskien.datastructures_algorithms.array;


import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 2958: Length of Longest Subarray With at Most K Frequency
 * @author chisk
 * @since 28/3/2024
 * @implNote Sliding Window, Array, HashMap
 */

public class LengthOfLongestSubArrayAtMostKFrequency {
    public static void main(String[] args) {
        System.out.println(longestSubArray(new int[]{1, 2, 3, 1, 2, 3, 1, 2}, 2));
    }

    public static int longestSubArray(int[] nums, int k) {
        int longestLength = 0;
        Map<Integer, Integer> frequenciesMap = new HashMap<>();
        for (int i = 0, j = 0; i < nums.length; i++) {
            frequenciesMap.put(nums[i], frequenciesMap.getOrDefault(nums[i], 0) + 1);
            while (frequenciesMap.get(nums[i]) > k) {
                frequenciesMap.put(nums[j], frequenciesMap.get(nums[j]) - 1);
                j++;
            }
            longestLength = Math.max(longestLength, i - j + 1);
        }

        return longestLength;
    }
}
