package chiskien.datastructures_algorithms.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    //    public boolean wordPattern(String pattern, String s) {
//        String[] charsInPattern = pattern.split("");
//        String[] charsInS = s.split(" ");
//        if (charsInS.length != charsInPattern.length) return false;
//        Map<String, String> frequencyPattern = new HashMap<>();
//        for (int i = 0; i < charsInPattern.length; i++) {
//            String b = frequencyPattern.put(charsInPattern[i], charsInS[i]);
//            String c = frequencyPattern.get(charsInPattern[i]);
//            if (b != null && !b.equals(c)) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean wordPattern(String pattern, String s) {
        String[] patternArr = pattern.split("");
        String[] strArr = s.split(" ");
        Map<String, String> patternMap = new HashMap<>();
        Map<String, String> strMap = new HashMap<>();
        if (patternArr.length != strArr.length) return false;
        for (int i = 0; i < patternArr.length; i++) {
            String a = patternMap.put(patternArr[i], strArr[i]);
            String b = strMap.put(strArr[i], patternArr[i]);
        }
        return true;
    }
}
