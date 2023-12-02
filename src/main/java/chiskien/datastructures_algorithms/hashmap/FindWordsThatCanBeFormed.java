package chiskien.datastructures_algorithms.hashmap;

import java.util.Arrays;

public class FindWordsThatCanBeFormed {

    //You are given an array of strings words and a string chars.
    //A string is good if it can be formed by characters from chars (each character can only be used once).
    //Return the sum of lengths of all good strings in words.
    public static void main(String[] args) {

    }

    public int countCharacters(String[] words, String chars) {
        int[] frequencies = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            frequencies[chars.charAt(i) - 'a']++;
        }

        int result = 0;
        for (String word : words) {
            int[] copy = Arrays.copyOf(frequencies, frequencies.length);
            boolean pass = true;
            for (int j = 0; j < word.length(); j++) {
                // decrement the frequency of this char in array for using
                // if there are less than 1 chance for using this character, invalid,
                // move to next word in words
                if (--copy[word.charAt(j) - 'a'] < 0) {
                    pass = false;
                    break;
                }
            }
            if (pass) {
                result += word.length();
            }
        }
        return result;
    }
}
