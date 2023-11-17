package chiskien.datastructures_algorithms.stack;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    //each function takes O(1)
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int val) {
        stack.push(val);
        int min;
        if (minStack.isEmpty()) {
            min = val;
        } else {
            min = Math.min(val, minStack.peek());
        }
        minStack.push(min);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


}
