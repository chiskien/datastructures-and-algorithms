package org.chiskien.leetcode.queue;

import org.chiskien.leetcode.linked_list.SinglyLinkedList;
import org.chiskien.leetcode.linked_list.Node;

public class Queue<T> {
    private final SinglyLinkedList<T> singlyLinkedList;

    public Queue() {
        this.singlyLinkedList = new SinglyLinkedList<>();
    }

    public void enqueue(Node<T> newNode) {
        singlyLinkedList.addToTail(newNode);
    }

    public void dequeue() {
        singlyLinkedList.removeHead();
    }

    public String traverse() {
        return singlyLinkedList.traverse();
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
