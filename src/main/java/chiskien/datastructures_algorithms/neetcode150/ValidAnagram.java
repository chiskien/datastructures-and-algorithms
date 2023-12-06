package chiskien.datastructures_algorithms.neetcode150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isValidAnagramSort(String s, String t) {
        char[] charT = t.toCharArray();
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        String t1 = String.valueOf(charT);
        String s1 = String.valueOf(charS);
        return t1.equals(s1);
    }

    public boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> frequencyS = new HashMap<>();
        Map<Character, Integer> frequencyT = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (frequencyS.containsKey(c)) {
                frequencyS.put(c, frequencyS.get(c) + 1);
            } else {
                frequencyS.put(c, 1);
            }
        }
        for (Character c : t.toCharArray()) {
            if (frequencyT.containsKey(c)) {
                frequencyT.put(c, frequencyT.get(c) + 1);
            } else {
                frequencyT.put(c, 1);
            }
        }
        return frequencyS.equals(frequencyT);
    }
}
