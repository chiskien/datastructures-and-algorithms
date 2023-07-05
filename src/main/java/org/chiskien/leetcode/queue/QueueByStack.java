package org.chiskien.leetcode.queue;


import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueByStack {
    private Deque<Integer> enq = new LinkedList<>();
    private Deque<Integer> deq = new LinkedList<>();

    public void enqueue(Integer x) {
        enq.addFirst(x);
    }

    public Integer dequeue() {
        if (deq.isEmpty()) {
            while (!enq.isEmpty()) {
                deq.addFirst(enq.removeFirst());
            }
        }
        if (!deq.isEmpty()) {
            return deq.removeFirst();
        }
        throw new NoSuchElementException("Cannot dequeue an empty queue");
    }
}
