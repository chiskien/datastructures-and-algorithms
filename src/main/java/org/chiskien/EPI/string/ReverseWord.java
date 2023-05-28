package org.chiskien.EPI.string;

import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is                  fucking blue"));
    }

    public static String reverseWords(String s) {
        String removeTrailingAndLeadingSpaceStr = s.strip();
        String onlyOneSpace = removeTrailingAndLeadingSpaceStr.replaceAll("\\s+", " ");
        String[] words = onlyOneSpace.split(" ");
        int i = 0;
        int j = words.length;
        while (i < words.length / 2 && j > words.length / 2) {
            String temp = words[i];
            words[i] = words[j - 1];
            words[j - 1] = temp;
            i++;
            j--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < words.length; k++) {
            if (k != words.length - 1) {
                stringBuilder.append(words[k]).append(" ");
            } else {
                stringBuilder.append(words[k]);
            }
        }
        return stringBuilder.toString();
    }
}
