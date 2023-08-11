package org.chiskien.leetcode.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NearestRepeatedEntries {

    public int findNearestRepetition(List<String> paragraph) {
        Map<String, Integer> wordToLatestIndex = new HashMap<>();
        int nearestRepeatedDistance = Integer.MAX_VALUE;
        for (int i = 0; i < paragraph.size(); i++) {
            if (wordToLatestIndex.containsKey(paragraph.get(i))) {
                nearestRepeatedDistance = Math.min(nearestRepeatedDistance,
                        i - wordToLatestIndex.get(paragraph.get(i)));
            }
            wordToLatestIndex.put(paragraph.get(i), i);
        }
        return nearestRepeatedDistance;
    }
}
