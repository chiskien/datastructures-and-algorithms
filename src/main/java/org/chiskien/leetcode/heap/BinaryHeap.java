package org.chiskien.leetcode.heap;


import java.util.*;

//Heap (also referred to as a priority queue)
public class BinaryHeap {

    //Given a collections of Strings => compute the k longest strings in the sequence
    public List<String> topK(int k, Iterator<String> iter) {
        PriorityQueue<String> minHeap = new PriorityQueue<>(k, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        while (iter.hasNext()) {
            minHeap.add(iter.next());
            if (minHeap.size() > k) {

                //remove the shortest string. The Comparison function
                //will order the strings by length;
                minHeap.poll();
            }
        }
        return new ArrayList<>(minHeap);
    }
}
