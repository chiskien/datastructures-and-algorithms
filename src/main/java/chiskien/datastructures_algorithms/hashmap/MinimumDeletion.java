package chiskien.datastructures_algorithms.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MinimumDeletion {

    public int minDeletion(String s) {
        int count = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                frequencyMap.put(c, 1);
            } else {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            }
        }
        return 1;
    }
}
