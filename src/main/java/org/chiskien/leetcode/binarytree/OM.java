package org.chiskien.leetcode.binarytree;

import java.util.Deque;
import java.util.LinkedList;

public class OM {

    public static void main(String[] args) {
        String[] input = new String[]{"4","2","5","3","#","#","#"};
        System.out.println(solution(input));
    }

    public static String solution(String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        Deque<String> deque = new LinkedList<>();
        int i = 0;
        deque.push(strArr[i]);
        while (!deque.isEmpty() && 2 * i + 2 <= strArr.length) {
            String current = deque.removeFirst();
            if (!current.equals("#")) {
                stringBuilder.append(current).append(" ");
                deque.addFirst(strArr[2 * i + 2]);
                deque.addFirst(strArr[2 * i + 1]);
                i++;
            }
        }
        return stringBuilder.toString().stripTrailing();
    }
}
