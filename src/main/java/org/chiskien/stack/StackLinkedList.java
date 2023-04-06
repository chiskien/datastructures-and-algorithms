package org.chiskien.stack;

import org.chiskien.linked_list.LinkedList;
import org.chiskien.linked_list.Node;

public class StackLinkedList<T> {
    private final LinkedList<T> linkedList;

    public StackLinkedList() {
        linkedList = new LinkedList<>();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public void push(Node<T> newNode) {
        linkedList.addToHead(newNode);
    }

    public void pop() {
        linkedList.removeHead();
    }
    
    @Override
    public String toString() {
        return linkedList.traverse();
    }
}

class Main {

    public static void main(String[] args) {
        StackLinkedList<Integer> stackLinkedList = new StackLinkedList<>();

    }
}