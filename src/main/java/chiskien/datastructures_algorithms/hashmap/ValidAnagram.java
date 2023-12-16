package chiskien.datastructures_algorithms.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isValidAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (char c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }
        return mapS.equals(mapT);
    }

    public boolean isValidAnagramOptimized(String s, String t) {
        if (s.length() != t.length()) return false;
        final int[] COUNT_TABLE = new int[26];
        for (char c : s.toCharArray()) {
            COUNT_TABLE[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            COUNT_TABLE[c - 'a']--;
        }
        for (int symbol : COUNT_TABLE) {
            if (symbol != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidAnagramSort(String s, String t) {
        char[] charT = t.toCharArray();
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        String t1 = String.valueOf(charT);
        String s1 = String.valueOf(charS);
        return t1.equals(s1);
    }
}
