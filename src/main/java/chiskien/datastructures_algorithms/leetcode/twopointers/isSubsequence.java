package chiskien.datastructures_algorithms.leetcode.twopointers;

public class isSubsequence {


    public static boolean isSubsequences(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
