package chiskien.datastructures_algorithms.leetcode.searching;

public class FindMinAndMaxSimultaneously {
    static class MinMax {
        public Integer min;
        public Integer max;

        public MinMax(Integer min, Integer max) {
            this.min = min;
            this.max = max;
        }

        private static MinMax getMinMax(Integer a, Integer b) {
            //if b < a then b is min, A is max or otherwise
            return b < a ? new MinMax(b, a) : new MinMax(a, b);
        }
    }

    // Given an array, find min and max
    // Time complexity: O(n) since iterate all over the array
    // Space complexity: O(1): no additional storage allocated
    public int[] findMinMax(int[] nums) {
        if (nums.length == 1)
            return new int[]{nums[0], nums[0]};
        if (nums.length == 0)
            return new int[]{};
        MinMax globalMinMax = MinMax.getMinMax(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i += 2) {
            //compare a pair of (nums[i] and nums[i+1])
            // and then return new MinMax based on a result.
            MinMax localMinMax = MinMax.getMinMax(nums[i], nums[i + 1]);
            //reassigned previous min max with a current min max pair by
            // comparing min with min, max with max
            globalMinMax = new MinMax(Math.min(globalMinMax.min, localMinMax.min)
                    , Math.max(globalMinMax.max, localMinMax.max));
        }
        //if length is odd then compare min max with last element.
        if (nums.length % 2 != 0) {
            globalMinMax = new MinMax(
                    Math.min(globalMinMax.min, nums[nums.length - 1]),
                    Math.max(globalMinMax.max, nums[nums.length - 1])
            );
        }
        return new int[]{globalMinMax.min, globalMinMax.max};
    }
}

