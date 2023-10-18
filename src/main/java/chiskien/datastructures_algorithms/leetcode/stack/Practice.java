package chiskien.datastructures_algorithms.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

public class Practice {


    //Brackets
    public boolean isWellForm(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if ((s.charAt(i) == ')' && stack.peek() != '(')
                        || (s.charAt(i) == '}' && stack.peek() != '{')
                        || (s.charAt(i) == ']' && stack.peek() != '[')
                ) {
                    return false;
                }
                stack.pop();
            }
        }
        return true;
    }

    //RPN evaluate

    //

}
