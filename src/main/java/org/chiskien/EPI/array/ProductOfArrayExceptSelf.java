package org.chiskien.EPI.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answers = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for (Integer num : nums) {
            list.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            list.remove(i);
            int result = 1;
            for (Integer remain : list) {
                result *= remain;
            }
            answers[i] = result;
        }
        return answers;
    }
}
