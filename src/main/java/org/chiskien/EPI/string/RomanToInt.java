package org.chiskien.EPI.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        String s = "MCMDWQMWEMQW";
        romanToInt(s);
    }

    public static int romanToInt(String s) {
        Map<String, Integer> romanConverter = new HashMap<>();
        romanConverter.put("I", 1);
        romanConverter.put("IV", 4);
        romanConverter.put("V", 5);
        romanConverter.put("IX", 9);
        romanConverter.put("X", 10);
        romanConverter.put("XL", 40);
        romanConverter.put("L", 50);
        romanConverter.put("XC", 90);
        romanConverter.put("C", 100);
        romanConverter.put("CD", 400);
        romanConverter.put("D", 500);
        romanConverter.put("CM", 900);
        romanConverter.put("M", 1000);

        String[] romanString = s.split("");
        System.out.println(Arrays.toString(romanString));
        return 1;
    }
}
