package chiskien.datastructures_algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public static void main(String[] args) {
        findTheDiff("acac", "acca");
    }

    public static void findTheDiff(String s, String t) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        for (Character c : t.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return;
            }
        }
    }
}
