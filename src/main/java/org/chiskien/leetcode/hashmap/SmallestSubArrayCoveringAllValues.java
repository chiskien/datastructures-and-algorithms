package org.chiskien.leetcode.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SmallestSubArrayCoveringAllValues {

    //Algorithms which:
    //input: an array of strings
    // output: indices of starting and ending index of a shortest subarray that
    // covers the set


    public int[] findSmallestSubarrayCoveringSetOfWords(List<String> paragraph,
                                                        Set<String> words) {
        Map<String, Integer> keyWordsToCover = new HashMap<>();
        for (String keyword : words) {
            if (keyWordsToCover.containsKey(keyword)) {
                keyWordsToCover.put(keyword, keyWordsToCover.get(keyword) + 1);
            } else {
                keyWordsToCover.put(keyword, 1);
            }
        }
        int[] result = new int[2];
        result[0] = -1; //first index
        result[1] = -1; // second index

        int remainingToCover = words.size();
        for (int left = 0, right = 0; right < paragraph.size(); right++) {
            String currentWordInParagraph = paragraph.get(right);
            Integer keyWordsCount = keyWordsToCover.get(currentWordInParagraph);
            if (keyWordsCount != null) {
                keyWordsToCover.put(currentWordInParagraph, --keyWordsCount);
                if (keyWordsCount >= 0) {
                    --remainingToCover;
                }
            }

            while (remainingToCover == 0) {
                if (result[0] == -1 || right - left < result[1] - result[0]) {
                    result[0] = left;
                    result[1] = right;
                }
                keyWordsCount = keyWordsToCover.get(paragraph.get(left));
                if (keyWordsCount != null) {
                    keyWordsToCover.put(paragraph.get(left), ++keyWordsCount);
                    if (keyWordsCount > 0) {
                        ++remainingToCover;
                    }
                }
                ++left;
            }
        }
        return result;
    }
}
