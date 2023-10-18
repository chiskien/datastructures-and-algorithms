package chiskien.datastructures_algorithms.leetcode.two_pointers;

import java.util.*;

public class ThreeSome {

    public List<List<Integer>> threeSome(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int threeSome = nums[low] + nums[high] + nums[i];
                if (threeSome > 0) {
                    high--;
                } else if (threeSome < 0) {
                    low++;
                } else {
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[low++]);
                    triplets.add(nums[high]);
                    result.add(triplets);
                    while (nums[low] == nums[low - 1] && low < high) {
                        low++;
                    }
                }
            }
            System.gc();
        }
        return result;
    }
}
