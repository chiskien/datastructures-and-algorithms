package chiskien.datastructures_algorithms.neetcode150;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.addFirst(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (s.charAt(i) == '}' && stack.peekFirst() != '{'
                        || s.charAt(i) == ']' && stack.peekFirst() != '['
                        || s.charAt(i) == ')' && stack.peekFirst() != '(') {
                    return false;
                }
                stack.removeFirst();
            }

        }
        return stack.isEmpty();
    }
}
