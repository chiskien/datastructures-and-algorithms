package chiskien.datastructures_algorithms.leetcode.string;

public class ReverseWord {


    public static String reverseWords(String s) {
        String[] words = s.strip()
                .replaceAll("\\s+", " ")
                .split(" ");
        int i = 0;
        int j = words.length;
        while (i < j) {
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
