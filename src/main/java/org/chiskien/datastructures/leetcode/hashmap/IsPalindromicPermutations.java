package org.chiskien.datastructures.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsPalindromicPermutations {

    public boolean canFormPalindromePermutation(String s) {
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (!charFrequencies.containsKey(c)) {
                charFrequencies.put(c, 1);
            } else {
                charFrequencies.put(c, charFrequencies.get(c) + 1);
            }
        }

        // A String can be permuted as a palindrome if and only if the number of
        // chars whose frequencies is odd is at most 1
        int oddCount = 0;
        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
            if ((entry.getValue() % 2 != 0) && ++oddCount > 1) {
                return false;
            }
        }
        return true;
    }
}
