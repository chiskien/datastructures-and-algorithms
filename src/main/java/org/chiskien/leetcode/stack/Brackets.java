package org.chiskien.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

public class Brackets {

    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {
        Deque<Character> leftChars = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                leftChars.addFirst(s.charAt(i));
            } else {
                if (leftChars.isEmpty()) {
                    return false;
                }
                if ((s.charAt(i) == ')' && leftChars.peekFirst() != '(')
                        || (s.charAt(i) == '}' && leftChars.peekFirst() != '{')
                        || (s.charAt(i) == ']' && leftChars.peekFirst() != '[')
                )  {
                    return false;
                }
                leftChars.removeFirst();
            }
        }
        return leftChars.isEmpty();
    }
}
