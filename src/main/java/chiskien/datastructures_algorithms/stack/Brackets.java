package chiskien.datastructures_algorithms.stack;

import java.util.Deque;
import java.util.LinkedList;

public class Brackets {

    public static boolean isValid(String s) {
        Deque<Character> leftChars = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                leftChars.push(s.charAt(i));
            } else {
                if (leftChars.isEmpty()) {
                    return false;
                }
                if ((s.charAt(i) == ')' && leftChars.peek() != '(')
                        || (s.charAt(i) == '}' && leftChars.peek() != '{')
                        || (s.charAt(i) == ']' && leftChars.peek() != '[')) {
                    return false;
                }
                leftChars.pop();
            }
        }
        return leftChars.isEmpty();
    }
}
