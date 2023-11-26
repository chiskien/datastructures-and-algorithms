package chiskien.datastructures_algorithms.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratePermutation {

    //LeetCode 46,
    //Given an array nums of distinct integers, return all the possible permutations.
    // You can return the answer in any order.

    //Example 1:
    //Input: nums = [1,2,3]
    //Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    public static void main(String[] args) {
        GeneratePermutation generatePermutation = new GeneratePermutation();
        System.out.println(generatePermutation.permute(new int[]{2, 3, 5, 6}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        directedPermutations(0, nums, result);
        return result;
    }

    public void directedPermutations(int i, int[] nums, List<List<Integer>> result) {
        if (i == nums.length - 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
        }
        //try every possibility for nums[i]
        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            directedPermutations(i + 1, nums, result);
            swap(nums, i, j);
        }

    }


    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
