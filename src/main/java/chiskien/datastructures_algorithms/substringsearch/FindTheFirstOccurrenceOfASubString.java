package chiskien.datastructures_algorithms.substringsearch;

public class FindTheFirstOccurrenceOfASubString {

    //given two strings s and t, find the first occurrence of s in t
    //constraints: s.length < t.length

    public static void main(String[] args) {
        RabinKarp rabinKarp = new RabinKarp();
        KnuthMorrisPratt knuthMorrisPratt = new KnuthMorrisPratt();
        BoyerMoore boyerMoore = new BoyerMoore();
        System.out.println(findFirstOccurrenceOfSubString("key", "donkey"));
    }

    //Using Java built-in substring search algorithms
    public static int haystackInTheNeedle(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    //BruteForce: Using two nested for loop
    //Time complexity: O(m * (n-m)), Worst case: O(n * m) ~ O(m2) if n == m
    public static int findFirstOccurrenceOfSubString(String pattern, String text) {
        int patternLength = pattern.length();
        int textLength = text.length();
        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;
            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == patternLength) return i; //return the current index where the pattern starts
        }
        return -1; //not found
    }
}

