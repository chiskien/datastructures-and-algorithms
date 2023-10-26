package chiskien.datastructures_algorithms.leetcode.array.practices;

import java.util.Collections;

public class EvenOddMerge {


    //6.0
    public void evenOddMerge(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 != 0) {
                int temp = nums[i];
                nums[i++] = nums[j] ;
                nums[j--] = temp;
            } else {
                i++;
            }
        }
    }
}
