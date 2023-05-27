package org.chiskien.leetcode;

public class Main {
    public static void main(String[] args) {

    }

    public static String mergeStringAlternately(String word1, String word2) {
        char[] charset1 = word1.toCharArray();
        char[] charset2 = word2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        if (word1.length() >= word2.length()) {
            int i = 0;
            while (i < word2.length()) {
                stringBuilder.append(charset1[i]).append(charset2[i]);
                i++;
            }

        }
        return "";
    }
}
