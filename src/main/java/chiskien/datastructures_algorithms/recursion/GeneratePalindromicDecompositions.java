package chiskien.datastructures_algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class GeneratePalindromicDecompositions {


    //Compute all palindromic decompositions of a given string.
    // For example, if the string is "0204451881",
    // then the decomposition "020","44", "5", "1881" is palindromic,
    // as is "020", "44", "5", "1", "88", "1".
    // However, "02044, "5", "1881" is not a palindromic decomposition.

    public List<List<String>> palindromePartitioning(String input) {
        List<List<String>> result = new ArrayList<>();
        List<String> partialPartition = new ArrayList<>();
        directedPalindromePartitioning(input, 0, partialPartition, result);
        return result;
    }

    private void directedPalindromePartitioning(String input, int offset,
                                                List<String> partialPartition,
                                                List<List<String>> result) {
        if (offset == input.length()) {
            result.add(new ArrayList<>(partialPartition));
            return;
        }
        for (int i = offset + 1; i <= input.length(); i++) {
            String prefix = input.substring(offset, i);
            if (isPalindrome(prefix)) {
                partialPartition.add(prefix);
                directedPalindromePartitioning(input, i, partialPartition, result);
                partialPartition.removeLast();
            }
        }
    }

    private boolean isPalindrome(String prefix) {
        for (int i = 0, j = prefix.length() - 1; i < j; i++, j--) {
            if (prefix.charAt(i) != prefix.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
