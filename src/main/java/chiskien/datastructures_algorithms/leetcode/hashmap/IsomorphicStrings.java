package chiskien.datastructures_algorithms.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        char c; //initialize
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                c = map.get(s.charAt(i));
                if (c != t.charAt(i)) {
                    return false;
                }
            } else if (!map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
