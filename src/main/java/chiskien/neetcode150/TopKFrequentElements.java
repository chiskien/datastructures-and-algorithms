package chiskien.neetcode150;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class TopKFrequentElements {


    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> frequenciesMap = new HashMap<>();
        for (Integer num : nums) {
            if (frequenciesMap.containsKey(num)) {
                frequenciesMap.put(num, frequenciesMap.get(num) + 1);
            } else {
                frequenciesMap.put(num, 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(k, (o1, o2) -> o2.getValue() - o1.getValue());

        maxHeap.addAll(frequenciesMap.entrySet());
        for (int i = 0; i < k; i++) {
            result[i] = Objects.requireNonNull(maxHeap.poll()).getKey();
        }
        return result;
    }
}
