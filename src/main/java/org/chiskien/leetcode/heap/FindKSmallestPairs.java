package org.chiskien.leetcode.heap;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKSmallestPairs {


    public static void kSmallestPair(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer> minHeap1 = new PriorityQueue<>(nums1.length);
        PriorityQueue<Integer> minHeap2 = new PriorityQueue<>(nums2.length);

        for (int j : nums1) {
            minHeap1.add(j);
        }
        for (int j : nums2) {
            minHeap2.add(j);
        }
        System.out.println(minHeap1);
        System.out.println(minHeap2);
    }
}
