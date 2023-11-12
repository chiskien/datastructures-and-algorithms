package chiskien.datastructures_algorithms.leetcode.array.practices;

import java.util.Arrays;

public class DeleteDuplicate {

    //delete duplicate in a sorted array
    //do not use an auxiliary array
    //modify array inplace

    public int deleteDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
