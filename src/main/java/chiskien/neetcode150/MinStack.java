package chiskien.neetcode150;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MinStack {
    private Node head;

    public MinStack() {

    }

    public void push(int val) {
        if (isEmpty()) {
            head = new Node(val, val, null);
        } else {
            int min = Math.min(val, head.min);
            head = new Node(val, min, head);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int top() {
        return head.val;
    }

    public void pop() {
        head = head.next;
    }

    public int getMin() {
        return head.min;
    }
}

class Node {
    int min;
    int val;
    Node next;

    public Node(int val, int min, Node next) {
        this.min = min;
        this.val = val;
        this.next = next;
    }
}
