package chiskien.neetcode150;

public class TwoSumArrayIsSorted {

    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while (first < last) {
            int sum = nums[first] + nums[last];
            if (sum == target) {
                return new int[]{first, last};
            } else if (sum < target) {
                first++;
            } else {
                last--;
            }
        }
        return null;
    }
}
