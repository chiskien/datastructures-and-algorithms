package chiskien.datastructures_algorithms.leetcode.binarytree;

import java.util.Deque;
import java.util.LinkedList;

public class OM {



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
