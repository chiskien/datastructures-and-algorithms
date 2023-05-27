package org.chiskien.EPI.string;

public class PalindromicString {

    public static void main(String[] args) {

    }

    // A palindromic string is one which reads the same when it is reversed
    public static boolean isPalindromic(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
