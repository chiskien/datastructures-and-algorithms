package chiskien.datastructures_algorithms.leetcode.twopointers;

public class SortArrayByParity {


    //Solution by EPI
    public int[] evenOdd(int[] nums) {
        int nextEven = 0;
        int nextOdd = nums.length - 1;
        while (nextEven < nextOdd) {
            if (nums[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = nums[nextEven];
                nums[nextEven] = nums[nextOdd];
                nums[nextOdd--] = temp;
            }
        }
        return nums;
    }

    //My Solution
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
            } else if (nums[j] % 2 != 0) {
                j--;
            } else if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j--] = temp;
            }
        }
        return nums;
    }
}
