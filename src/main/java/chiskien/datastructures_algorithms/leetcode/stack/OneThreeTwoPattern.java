package chiskien.datastructures_algorithms.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

public class OneThreeTwoPattern {


    //for each i < j < k => nums[i] < nums[k] < nums[j]
    public boolean find132Pattern(int[] nums) {
        Deque<Integer> stack = new LinkedList<>();
        int third = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
