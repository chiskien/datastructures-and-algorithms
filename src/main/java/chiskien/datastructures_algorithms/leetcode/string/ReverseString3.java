package chiskien.datastructures_algorithms.leetcode.string;


public class ReverseString3 {

    public String reverseWords(String s) {
        // "let's go" -> "s'tel og"
        String[] listWords = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : listWords) {
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            stringBuilder.append(" ");
            result.append(stringBuilder);
        }

        return result.toString().stripTrailing();
    }
}
