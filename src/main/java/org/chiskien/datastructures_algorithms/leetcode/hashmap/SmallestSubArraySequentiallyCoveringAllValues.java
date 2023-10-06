package org.chiskien.datastructures_algorithms.leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallestSubArraySequentiallyCoveringAllValues {

    public int[] findSmallestSequentiallyCoveringSubArray(List<String> paragraph, List<String> keywords) {
        //Map string to its indexes
        Map<String, Integer> keywordToIndex = new HashMap<>();
        List<Integer> latestOccurrence = new ArrayList<>(keywords.size());
        //for each keyword (identified by its index in keyword)
        List<Integer> shortestSubArrayLength = new ArrayList<>(keywords.size());
        for (int i = 0; i < keywords.size(); i++) {
            latestOccurrence.add(-1);
            shortestSubArrayLength.add(Integer.MAX_VALUE);
            keywordToIndex.put(keywords.get(i), i);
        }
        int shortestDistance = Integer.MAX_VALUE;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        for (int i = 0; i < paragraph.size(); i++) {
            Integer keywordIndex = keywordToIndex.get(paragraph.get(i));
            if (keywordIndex != null) {
                if (keywordIndex == 0) {
                    shortestSubArrayLength.set(0, 1);
                } else if ((shortestSubArrayLength.get(keywordIndex - 1))
                        != Integer.MAX_VALUE) {
                    int distanceToPreviousKeyword = i - latestOccurrence.get(keywordIndex - 1);
                    shortestSubArrayLength.set(keywordIndex, distanceToPreviousKeyword
                            + shortestSubArrayLength.get(keywordIndex - 1));

                }
                latestOccurrence.set(keywordIndex, i);

                if (keywordIndex == keywords.size() - 1 && shortestSubArrayLength
                        .get(shortestSubArrayLength.size() - 1) < shortestDistance) {
                    shortestDistance = shortestSubArrayLength.get(shortestSubArrayLength.size() - 1);
                    result[0] = i - shortestSubArrayLength.get(shortestSubArrayLength.size() - 1);
                    result[1] = i;
                }
            }

        }

        return result;
    }


}
