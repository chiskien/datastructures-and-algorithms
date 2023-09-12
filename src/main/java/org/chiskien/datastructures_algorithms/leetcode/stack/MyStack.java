package org.chiskien.datastructures_algorithms.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack {


    public Deque<Integer> enq;
    public Deque<Integer> deq;

    public MyStack() {
        enq = new LinkedList<>();
        deq = new LinkedList<>();
    }

    public void push(int x) {
        enq.addLast(x);
    }

    public int pop() {
        if (deq.isEmpty()) {
            while (!(enq.size() == 1)) {
                deq.addLast(enq.removeFirst());
            }
        }
        return enq.pop();
    }

    public boolean isEmpty() {
        return enq.isEmpty();
    }

}
