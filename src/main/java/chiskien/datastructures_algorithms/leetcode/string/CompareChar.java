package chiskien.datastructures_algorithms.leetcode.string;

public class CompareChar {



    public static char nextGreatestCharacter(char[] letters, char target) {
        char min = 'z';
        boolean found = false;
        for (Character c : letters) {
            if (c.compareTo(target) > 0) {
                found = true;
                if (c.compareTo(min) < 0) {
                    min = c;
                }
            }
        }
        return found ? min : letters[0];
    }
}
