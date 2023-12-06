package chiskien.datastructures_algorithms.neetcode150;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumDiffTables = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (sumDiffTables.containsKey(diff)) {
                return new int[]{sumDiffTables.get(diff), i};
            } else {
                sumDiffTables.put(nums[i], i);
            }

        }
        return null;
    }
}
