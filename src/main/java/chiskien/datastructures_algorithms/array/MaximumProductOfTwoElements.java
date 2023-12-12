package chiskien.datastructures_algorithms.array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumProductOfTwoElements {

    public int maxProductUsingPriorityQueue(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(2);
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > 2) {
                minHeap.poll();
            }
        }
        int firstLargest = minHeap.poll();
        int second = minHeap.poll();
        return (firstLargest - 1) * (second - 1);

    }

    public int maxProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
            } else if (nums[i] <= first && nums[i] > second) {
                second = nums[i];
            }
        }
        return (first - 1) * (second - 1);
    }
}
