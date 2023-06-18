package org.chiskien.EPI.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //key: i, value: nums[i]
            Integer value = map.put(nums[i], i);
            if (value != null && i - value <= k) {
                return true;
            }
        }
        return false;
    }
}
