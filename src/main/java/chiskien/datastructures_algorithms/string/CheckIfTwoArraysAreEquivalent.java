package chiskien.datastructures_algorithms.string;

public class CheckIfTwoArraysAreEquivalent {

    //Given two string arrays word1 and word2,
    // return true if the two arrays represent the same string, and false otherwise.
    //A string is represented by an array if the array elements concatenated
    // in order forms the string.

    //Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
    //Output: true

    //Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
    //Output: false
    public static void main(String[] args) {
        String[] word1 = {"mot", "con", "vit"};
        String[] word2 = {"motcov", "vit"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (String string : word1) {
            str1.append(string);
        }
        for (String s : word2) {
            str2.append(s);
        }
        return str1.toString().contentEquals(str2);
    }
}
