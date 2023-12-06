package chiskien.datastructures_algorithms.neetcode150;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
                if (frequency.get(num) >= 2) {
                    return true;
                }
            } else {
                frequency.put(num, 1);
            }
        }
        return false;
    }
}
