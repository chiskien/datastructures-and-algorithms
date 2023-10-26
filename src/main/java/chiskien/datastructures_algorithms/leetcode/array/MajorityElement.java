package chiskien.datastructures_algorithms.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class MajorityElement {

    public int majorityElementCK(int[] nums) {
        if (nums.length == 0) throw new NoSuchElementException();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num,frequencyMap.get(num) + 1);
                if (frequencyMap.get(num) > nums.length / 2) {
                    return num;
                }
            } else {
                frequencyMap.put(num, 1);
            }
        }
        return nums[0];
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        int i;
        for (i = 0; i < n; i++) {
            if (count > n / 2) {
                return nums[i];
            } else if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }

        }
        return nums[i];
    }
}
