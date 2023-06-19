package org.chiskien.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    static Map<Character, Integer> romanDictionary = new HashMap<>();

    public static void main(String[] args) {
        romanDictionary.put('I', 1);
        romanDictionary.put('V', 5);
        romanDictionary.put('X', 10);
        romanDictionary.put('L', 50);
        romanDictionary.put('C', 100);
        romanDictionary.put('D', 500);
        romanDictionary.put('M', 1000);


        String s = "XXXVIII";
        System.out.println(romanToInt(s));
    }

    public static String intToRoman(int num) {
        //assump  num = 548: DXLVIII;
        return "";
    }

    public static int romanToInt(String s) {

        char lastCharacter = s.charAt(s.length() - 1);
        int sum = romanDictionary.get(lastCharacter);
        for (int i = s.length() - 2; i >= 0; i--) {
            int current = romanDictionary.get(s.charAt(i));
            int after = romanDictionary.get(s.charAt(i + 1));
            if (current < after) {
                sum -= current;
            } else {
                sum += current;
            }
        }
        return sum;
    }
}
