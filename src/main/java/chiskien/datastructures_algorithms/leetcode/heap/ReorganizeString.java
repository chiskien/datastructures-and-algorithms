package chiskien.datastructures_algorithms.leetcode.heap;

import java.util.*;

public class ReorganizeString {


    public String reorganizeString(String s) {
        //storing character and their appearance
        Map<Character, Integer> frequenciesMap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            frequenciesMap.put(c, frequenciesMap.getOrDefault(c, 0) + 1);
        }

        //Construct a max-heap, order by their frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
                (a, b) -> frequenciesMap.get(b) - frequenciesMap.get(a)
        );
        maxHeap.addAll(frequenciesMap.keySet());

        StringBuilder stringBuilder = new StringBuilder();
        while (maxHeap.size() >= 2) {
            char first = maxHeap.poll();
            char second = maxHeap.poll();

            stringBuilder.append(first);
            stringBuilder.append(second);

            frequenciesMap.put(first, frequenciesMap.get(first) - 1); //decrease their counting
            frequenciesMap.put(second, frequenciesMap.get(second) - 1);

            if (frequenciesMap.get(first) > 0) maxHeap.add(first);
            if (frequenciesMap.get(second) > 0) maxHeap.add(second);
        }
        if (!maxHeap.isEmpty()) {
            char remaining = maxHeap.poll();
            if (frequenciesMap.get(remaining) > 1) return ""; //not able to organize
            stringBuilder.append(remaining);
        }

        return stringBuilder.toString();
    }


    public String reorganizeStringCK(String s) {
        Deque<Character> stack = new LinkedList<>();
        Deque<Character> temp = new LinkedList<>();
        stack.push(s.toCharArray()[0]);
        temp.push(s.toCharArray()[0]);
        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if (stack.peek() != c) {
                    stack.push(c);
                } else {
                    temp.push(c);
                }
            }
        }
        return "";
    }
}
