package org.chiskien.datastructures.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for (String token : tokens) {
            if (token.length() == 1 && "+-/*".contains(token)) { //if token is operator
                final int first = deque.pop();
                final int second = deque.pop();
                switch (token) {
                    case "+" -> deque.push(first + second);
                    case "*" -> deque.push(first * second);
                    case "-" -> deque.push(second - first);
                    case "/" -> deque.push(second / first);
                    default -> throw new
                            IllegalArgumentException("malformed RPN at : " + token);
                }
            } else {
                deque.push(Integer.parseInt(token)); //if token is a digit
            }
        }
        return deque.peek();
    }
}
