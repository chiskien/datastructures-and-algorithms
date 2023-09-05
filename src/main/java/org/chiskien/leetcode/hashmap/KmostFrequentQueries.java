package org.chiskien.leetcode.hashmap;

import java.util.*;

public class KmostFrequentQueries {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 4, 4, 2, 2, 3, 3, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> frequenciesMap = new HashMap<>();
        for (Integer num : nums) {
            if (frequenciesMap.containsKey(num)) {
                frequenciesMap.put(num, frequenciesMap.get(num) + 1);
            } else {
                frequenciesMap.put(num, 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                k, (o1, o2) -> o2.getValue() - o1.getValue());

        for (Map.Entry<Integer, Integer> entry : frequenciesMap.entrySet()) {
            maxHeap.add(entry);
        }
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }
        return result;
    }
}
