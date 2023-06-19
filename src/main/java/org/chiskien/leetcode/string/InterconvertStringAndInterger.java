package org.chiskien.leetcode.string;

public class InterconvertStringAndInterger {

    public static void main(String[] args) {
        String s = "123";
        System.out.println(stringToInt(s));
    }

    //given an string s represent a interger, convert it to int without using parseInt

    public static int stringToInt(String s) {
        int result = 0;
        for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); i++) {
            final int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

        }
        return s.charAt(0) == '-' ? -result : result;
    }
}
