package chiskien.datastructures_algorithms.string;

import java.util.*;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        removeDuplicateLetters("aabbccdd");
    }

    public static String removeDuplicateLetters(String s) {
        StringBuilder builder = new StringBuilder();
        boolean[] visited = new boolean[26];
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!visited[s.charAt(i) - 'a']) {
                int lastCharacterIndex = builder.length() - 1;

            }
        }
        return "";
    }
}
