package chiskien.datastructures_algorithms.heap;

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
        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }
        return (first - 1) * (second - 1);
    }
}
