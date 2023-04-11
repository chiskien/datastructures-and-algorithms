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

    public String traverse() {
        return linkedList.traverse();
    }

}

class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(new Node<>(10));
        queue.enqueue(new Node<>(4));
        queue.enqueue(new Node<>(34));
        queue.enqueue(new Node<>(12));
        queue.dequeue();
        System.out.println(queue.traverse());
    }
}
