package chiskien.datastructures_algorithms.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chisk
 */
public class LongestSubstringWithoutRepeatingCharacters {


    public int longestSubstring(String s) {
        //Record the most recent occurrences of each entry
        //abcdabcdaaa
        Map<Character, Integer> mostRecentOccurrence = new HashMap<>();
        int longestLength = 0;
        int firstIndexOfLongestSub = 0;
        for (int i = 0; i < s.length(); i++) {
            //map.put return the previous value with a key or null (if not found)
            //find the duplicate one
            Integer duplicateIndex = mostRecentOccurrence.put(s.charAt(i), i);
            //indicate that there no mapping with key in hashmap
            if (duplicateIndex != null && (duplicateIndex >= firstIndexOfLongestSub)) {
                longestLength = Math.max(longestLength, i - firstIndexOfLongestSub);
                firstIndexOfLongestSub = duplicateIndex + 1;
            }
        }
        longestLength = Math.max(longestLength, s.length() - firstIndexOfLongestSub);
        return longestLength;
    }
}
