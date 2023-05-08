package org.chiskien.strings;

public class EPIString {
    public static void main(String[] args) {
        String s = "hoijoh";
        System.out.println(isPalindromic(s));
    }

    public static boolean isPalindromic(String s) {
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
