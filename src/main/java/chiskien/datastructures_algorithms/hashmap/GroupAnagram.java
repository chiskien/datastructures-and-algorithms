package chiskien.datastructures_algorithms.hashmap;

import java.util.*;

public class GroupAnagram {

    public List<List<String>> findAnagrams(List<String> dictionary) {
        Map<String, List<String>> sortedStringsToAnagram = new HashMap<>();
        for (String s : dictionary) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String newString = String.valueOf(charArray);
            if (!sortedStringsToAnagram.containsKey(newString)) {
                sortedStringsToAnagram.put(newString, new ArrayList<>());
            }
            sortedStringsToAnagram.get(newString).add(s);
        }
        List<List<String>> anagramGroups = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : sortedStringsToAnagram.entrySet()) {
            if (entry.getValue().size() >= 2) {
                anagramGroups.add(entry.getValue());
            }
        }

        return anagramGroups;
    }
}
