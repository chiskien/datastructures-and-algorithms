package org.chiskien.datastructures.leetcode.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKSmallestPairs {

    public List<List<Integer>> kSmallestPair(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer> minHeap1 = new PriorityQueue<>(nums1.length);
        PriorityQueue<Integer> minHeap2 = new PriorityQueue<>(nums2.length);
        List<List<Integer>> result = new ArrayList<>();
        for (int j : nums1) {
            minHeap1.add(j);
        }
        for (int j : nums2) {
            minHeap2.add(j);
        }
        for (int i = 0; i < k; i++) {
            if (minHeap1.size() != 1 || minHeap2.size() != 1) {
                int first = minHeap1.peek();
                int second = minHeap2.peek();
                List<Integer> pair = List.of(first, second);
                result.add(pair);
                if (first < second) {
                    if (minHeap2.size() == 1) {
                        minHeap1.remove();
                    } else {
                        minHeap2.remove();
                    }
                } else {
                    if (minHeap1.size() == 1) {
                        minHeap2.remove();
                    } else {
                        minHeap1.remove();
                    }
                }
            } else {
                int first = minHeap1.peek();
                int second = minHeap2.peek();
                List<Integer> pair = List.of(first, second);
                result.add(pair);
            }
        }
        return result;
    }
}
