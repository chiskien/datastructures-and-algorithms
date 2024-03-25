package chiskien.datastructures_algorithms.leetcode150;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SmallestSubArrayCoveringAllValues {

    public static class SubArray {
        public int firstIndex;
        public int lastIndex;

        public SubArray(int firstIndex, int lastIndex) {
            this.firstIndex = firstIndex;
            this.lastIndex = lastIndex;
        }

    }

    public int[] smallestSubArrayCoveringAllValues(String[] paragraph, String[] keywords) {
        //build a hash table store all the words in keywords and their appearances
        Map<String, Integer> keywordToCover = new HashMap<>();
        for (String keyword : keywords) {
            if (keywordToCover.containsKey(keyword)) {
                keywordToCover.put(keyword, keywordToCover.get(keyword) + 1);
            } else {
                keywordToCover.put(keyword, 1);
            }
        }
        SubArray subArray = new SubArray(-1, -1);
        int remainingWordsToCover = keywords.length;
        for (int left = 0, right = 0; right < paragraph.length; right++) {
            String currentWord = paragraph[right];
            Integer keywordCount = keywordToCover.get(currentWord);
            if (keywordCount != null) { //if keywords contains current word
                keywordToCover.put(currentWord, --keywordCount);
                if (keywordCount >= 0) {
                    --remainingWordsToCover;
                }
            }
            while (remainingWordsToCover == 0) {
                if (subArray.firstIndex == -1 || right - left < subArray.lastIndex - subArray.firstIndex) {
                    subArray.firstIndex = left;
                    subArray.lastIndex = right;
                }
                keywordCount = keywordToCover.get(paragraph[left]);
                if (keywordCount != null) {
                    keywordToCover.put(paragraph[left], ++keywordCount);
                    if (keywordCount >= 0) {
                        ++remainingWordsToCover;
                    }
                }
            }
            left++;
        }
        return new int[]{subArray.firstIndex, subArray.lastIndex};
    }
}
