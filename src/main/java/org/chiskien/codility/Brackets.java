package org.chiskien.codility;

import java.util.Deque;
import java.util.LinkedList;

public class Brackets {



    public static int solution(String S) {
        Deque<Character> leftChars = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' || S.charAt(i) == '{' || S.charAt(i) == '[') {
                leftChars.addFirst(S.charAt(i));
            } else {
                if (leftChars.isEmpty()) {
                    return 0;
                }
                if ((S.charAt(i) == ')' && leftChars.peekFirst() != '(')
                        || (S.charAt(i) == '}' && leftChars.peekFirst() != '{')
                        || (S.charAt(i) == ']' && leftChars.peekFirst() != '[')
                ) {
                    return 0;
                }
                leftChars.removeFirst();
            }
        }
        return leftChars.isEmpty() ? 1 : 0;
    }
}
