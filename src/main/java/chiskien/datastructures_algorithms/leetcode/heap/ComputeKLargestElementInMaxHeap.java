package chiskien.datastructures_algorithms.leetcode.heap;

import java.util.*;

public class ComputeKLargestElementInMaxHeap {


    private static class HeapEntry {
        public Integer index;
        public Integer value;

        public HeapEntry(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    private static class HeapEntryComparator implements Comparator<HeapEntry> {
        @Override
        public int compare(HeapEntry o1, HeapEntry o2) {
            return Integer.compare(o2.value, o1.value);
        }

        private static final HeapEntryComparator COMPARATOR_HEAP_ENTRIES =
                new HeapEntryComparator();
    }

    private final int DEFAULT_INITIAL_CAPACITY = 16;


    public List<Integer> kLargestElement(int[] heap, int k) {
        if (k <= 0) return Collections.emptyList();

        //Store the (index,value)-pair in candidateMaxHeap.
        // This heap is ordered by the value field
        PriorityQueue<HeapEntry> candidateMaxHeap = new PriorityQueue<>(
                DEFAULT_INITIAL_CAPACITY,
                HeapEntryComparator.COMPARATOR_HEAP_ENTRIES);

        candidateMaxHeap.add(new HeapEntry(0, heap[0]));
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (!candidateMaxHeap.isEmpty()) {
                int candidateIndex = candidateMaxHeap.peek().index;
                result.add(candidateMaxHeap.poll().value);

                int leftChildIndex = 2 * candidateIndex + 1;
                if (leftChildIndex < heap.length) {
                    candidateMaxHeap.add(new HeapEntry(leftChildIndex, heap[leftChildIndex]));
                }
                int rightChildIndex = 2 * candidateIndex + 2;
                if (rightChildIndex < heap.length) {
                    candidateMaxHeap.add(new HeapEntry(rightChildIndex, heap[rightChildIndex]));
                }
            }
        }
        return result;
    }
    //The total number of insertion and extract-max operations is O(k),
    // yielding an O(klogk) time complexity, and an O(K) additional space complexity

}

