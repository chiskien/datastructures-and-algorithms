package org.chiskien.datastructures_algorithms.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {


    public static boolean canConstruct(String ransomNote, String magazine) {
        //compute the frequency for all characters in ransomNote
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        //Check if the characters in magazine can cover characters in ransomNote
        for (Character c : magazine.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) - 1);
                if (frequencyMap.get(c) == 0) {
                    //reduce frequency of character in hashmap
                    frequencyMap.remove(c);

                    //if all characters are matched
                    if (frequencyMap.isEmpty()) {
                        break;
                    }
                }
            }
        }
        //If map is empty so that the magazine covers all characters in ransomNote
        return frequencyMap.isEmpty();
    }
}
