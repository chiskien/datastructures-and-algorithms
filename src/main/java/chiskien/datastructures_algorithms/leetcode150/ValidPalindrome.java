package chiskien.datastructures_algorithms.leetcode150;

import java.util.jar.JarEntry;

/**
 * LeetCode 125: Valid Palindrome
 * <br>
 * A phrase is a palindrome if after converting from uppercase to lowercase letters
 *
 * @author chisk
 * @since 21
 */
class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }


    /**
     * @param s input, example: ""
     * @return if the s is palindrome or not
     */
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                return false;
            }
        }
        return true;
    }
}
