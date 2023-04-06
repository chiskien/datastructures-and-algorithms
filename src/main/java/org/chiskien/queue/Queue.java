package org.chiskien.queue;

import org.chiskien.linked_list.LinkedList;
import org.chiskien.linked_list.Node;

public class Queue<T> {
    private final LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueue(Node<T> newNode) {
        linkedList.addToTail(newNode);
    }

    public void dequeue() {
        linkedList.removeHead();
    }
    

}
