package chiskien.datastructures_algorithms.string;

public class PalindromicString {



    // A palindromic string is one which reads the same when it is reversed
    public static boolean isPalindromic(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    //Test palindromicity
    //A man, a plan, a canal, Panama."
    // and "Able was I, ere I saw Elba!" are palindromic
    public static boolean isPalindrome(String s) {
        //two indices i moves forward, j moves backwards
        int i = 0, j = s.length() - 1;
        while (i < j) {
            // i and j both skip non-alpha
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i++)) !=
                    Character.toLowerCase(s.charAt(j--))) {
                return false;
            }
        }
        return true;
    }
}
