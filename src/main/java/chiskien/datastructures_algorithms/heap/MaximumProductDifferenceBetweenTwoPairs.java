package chiskien.datastructures_algorithms.heap;

import java.util.PriorityQueue;

public class MaximumProductDifferenceBetweenTwoPairs {

    public int maxProductDiff(int[] array) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(2);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(2,
                (o1, o2) -> Integer.compare(o2, o1));
        for (int num : array) {
            minHeap.add(num);
            maxHeap.add(num);
            if (minHeap.size() > 2) {
                minHeap.poll();
            }
            if (maxHeap.size() > 2) {
                maxHeap.poll();
            }
        }
        return minHeap.poll() * minHeap.poll() - maxHeap.poll() * maxHeap.poll();

    }
}
