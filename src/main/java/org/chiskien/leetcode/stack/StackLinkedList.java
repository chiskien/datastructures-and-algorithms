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

class Main {

    public static void main(String[] args) {
        StackLinkedList<Integer> stackLinkedList = new StackLinkedList<>();
        stackLinkedList.push(new Node<>(1));
        stackLinkedList.push(new Node<>(2));
        stackLinkedList.push(new Node<>(3));
        stackLinkedList.push(new Node<>(4));
        stackLinkedList.push(new Node<>(6));
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        System.out.println(stackLinkedList);
    }
}