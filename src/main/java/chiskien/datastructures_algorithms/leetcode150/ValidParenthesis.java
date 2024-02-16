package chiskien.datastructures_algorithms.leetcode150;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("[](){}[]{]"));
    }

    public static boolean isValid(String s) {
        //(){}[]
        //(]
        if (s.isEmpty()) return false;
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                deque.push(s.charAt(i));
            } else {
                if (deque.isEmpty()) return false;
                if ((s.charAt(i) == ')' && deque.peekFirst() != '(')
                        || (s.charAt(i) == '}' && deque.peekFirst() != '{')
                        || (s.charAt(i) == ']' && deque.peekFirst() != '[')) {
                    return false;
                }
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
