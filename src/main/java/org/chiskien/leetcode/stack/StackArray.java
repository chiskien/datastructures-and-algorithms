package org.chiskien.leetcode.stack;

import java.util.ArrayList;
import java.util.Arrays;

public class StackArray {
    protected int[] stack;
    private int N = 0;

    //Bad Practice when the client must provide capacity
    public StackArray() {
        stack = new int[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(int item) {
        if (N == stack.length) {
            resize(2 * stack.length);
        }
        stack[N++] = item;
    }

    private void resize(int capacity) {
        int[] copy = new int[capacity];
        if (N >= 0) System.arraycopy(stack, 0, copy, 0, N);
        stack = copy;
    }

    public int pop() {
        int item = stack[--N];
        stack[N] = 0;
        if (N > 0 && N == stack.length / 4) {
            resize(stack.length / 2);
        }
        return item;
    }


}
