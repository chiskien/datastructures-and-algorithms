package chiskien.datastructures_algorithms.leetcode.heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfOnlineData {


    private final int DEFAULT_INITIAL_CAPACITY = 16;

    public void onlineMedian(Collection<Integer> sequence) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                DEFAULT_INITIAL_CAPACITY, Collections.reverseOrder()
        );
        for (Integer i : sequence) {
            if (minHeap.isEmpty()) {
                minHeap.add(i);
            } else {
                if (i >= maxHeap.peek()) {
                    minHeap.add(i);
                } else {
                    maxHeap.add(i);
                }
            }
            if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.add(minHeap.remove());
            } else if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.remove());
            }
            System.out.println(minHeap.size() == maxHeap.size() ? 0.5 *
                    (minHeap.peek() + maxHeap.peek()) : minHeap.peek());
        }
    }
}
