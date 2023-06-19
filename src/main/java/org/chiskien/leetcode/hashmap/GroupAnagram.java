package org.chiskien.leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> result = new HashMap<>();
        for (String str : strs) {
            Map<Character, Integer> mapFrequency = getFrequencyString(str);
            if (result.containsKey(mapFrequency)) {
                result.get(mapFrequency).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                result.put(mapFrequency, list);
            }
        }
        return result.values().stream().toList();
    }

    public static Map<Character, Integer> getFrequencyString(String str) {
        Map<Character, Integer> mapFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            mapFrequency.put(c, mapFrequency.getOrDefault(c, 0) + 1);
        }
        return mapFrequency;
    }
}
