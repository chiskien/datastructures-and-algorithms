package org.chiskien.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (hashMap.containsKey(c) || hashMap.get(c) < 1) {
                return false;
            } else {
                hashMap.put(c, hashMap.getOrDefault(c, 0) - 1);
            }
        }
        return true;
    }
}
