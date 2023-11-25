package chiskien.neetcode150;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sortedStringToAnagrams = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);

            String newSortedString = new String(charArray);
            if (!sortedStringToAnagrams.containsKey(newSortedString)) {
                sortedStringToAnagrams.put(newSortedString, new ArrayList<>());
            }
            sortedStringToAnagrams.get(newSortedString).add(s);
        }
        return new ArrayList<>(sortedStringToAnagrams.values());

    }
}
