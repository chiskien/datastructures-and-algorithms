package chiskien.datastructures_algorithms.leetcode.heap;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

//Heap (also referred to as a priority queue)
public class BinaryHeap<T extends Comparable<T>> {

    public T[] heap;

    //Given a collections of Strings => compute the k longest strings in the sequence
    public List<String> topK(int k, Iterator<String> iter) {
        PriorityQueue<String> minHeap = new PriorityQueue<>(k,
                (o1, o2) -> Integer.compare(o1.length(), o2.length()));

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
