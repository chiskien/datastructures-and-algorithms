package chiskien.datastructures_algorithms.leetcode.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NearestRepeatedEntries {

    public int findNearestRepetition(List<String> paragraph) {
        Map<String, Integer> wordToIndexMapping = new HashMap<>();
        int nearestRepeatedDistance = Integer.MAX_VALUE;
        for (int i = 0; i < paragraph.size(); i++) {
            String word = paragraph.get(i);
            if (wordToIndexMapping.containsKey(word)) {
                //get the index of previous word
                int indexOfAppearedWord = wordToIndexMapping.get(word);

                //i right now is current index of current repeated word
                nearestRepeatedDistance = Math.min(nearestRepeatedDistance,
                        i - indexOfAppearedWord);
            }

            //if not exist in hashmap, put them with it's index as value
            wordToIndexMapping.put(word, i);
        }
        return nearestRepeatedDistance;
    }
}
