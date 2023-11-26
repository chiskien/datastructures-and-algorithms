package chiskien.neetcode150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSome {

    //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    public List<List<Integer>> threeSome(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int first = i + 1;
            int last = nums.length - 1;
            while (first < last) {


            }

        }

        return result;
    }
}
