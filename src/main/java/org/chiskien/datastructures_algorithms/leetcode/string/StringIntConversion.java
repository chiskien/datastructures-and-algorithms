package org.chiskien.datastructures_algorithms.leetcode.string;

public class StringIntConversion {

    public int stringToInt(String s) {
        int result = 0;
        for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
        }
        return s.charAt(0) == '-' ? result : -result;
    }
    
}
