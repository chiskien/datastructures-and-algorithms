package chiskien.datastructures_algorithms.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {



    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
