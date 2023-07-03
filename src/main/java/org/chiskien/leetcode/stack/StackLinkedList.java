package org.chiskien.leetcode.stack;

import org.chiskien.leetcode.linked_list.SinglyLinkedList;
import org.chiskien.leetcode.linked_list.Node;

public class StackLinkedList<T> {
    private final SinglyLinkedList<T> singlyLinkedList;

    public StackLinkedList() {
        singlyLinkedList = new SinglyLinkedList<>();
    }

    public boolean isEmpty() {
        return singlyLinkedList.isEmpty();
    }

    public void push(Node<T> newNode) {
        singlyLinkedList.addToHead(newNode);
    }

    public void pop() {
        singlyLinkedList.removeHead();
    }

    @Override
    public String toString() {
        return singlyLinkedList.traverse();
    }
}

