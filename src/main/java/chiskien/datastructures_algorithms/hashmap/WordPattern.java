package chiskien.datastructures_algorithms.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
//    public boolean wordPattern(String pattern, String s) {
//        String[] patternArr = pattern.split("");
//        String[] strArr = s.split(" ");
//        Map<String, String> patternMap = new HashMap<>();
//        Map<String, String> strMap = new HashMap<>();
//        if (patternArr.length != strArr.length) return false;
//        for (int i = 0; i < patternArr.length; i++) {
//            String a = patternMap.put(patternArr[i], strArr[i]);
//            String b = strMap.put(strArr[i], patternArr[i]);
//        }
//        return true;
//    }

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
    public boolean wordPattern(String pattern, String s) {

        Map<String, String> mappedString = new HashMap<>();
        String[] patternDivided = pattern.split("");
        String[] stringArray = s.split(" ");
        if (patternDivided.length != stringArray.length) return false;
        for (int i = 0; i < patternDivided.length; i++) {
            if (!mappedString.containsValue(stringArray[i])) {
                mappedString.put(patternDivided[i], stringArray[i]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : patternDivided) {
            stringBuilder.append(mappedString.get(str)).append(" ");
        }
        return s.equals(stringBuilder.toString().stripTrailing());
    }
}
