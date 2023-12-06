package chiskien.datastructures_algorithms.neetcode150;

import javax.sound.midi.MidiFileFormat;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        int first = 0;
        int last = s.length() - 1;
        while (first < last) {
            while (!Character.isLetterOrDigit(s.charAt(first))) {
                first++;
            }
            while (!Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            }
            if (Character.toLowerCase(s.charAt(first++)) !=
                    Character.toLowerCase(s.charAt(last--))) {
                return false;
            }
        }
        return true;
    }
}
