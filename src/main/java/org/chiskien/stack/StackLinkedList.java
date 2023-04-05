package org.chiskien.stack;

import org.chiskien.linked_list.LinkedList;
import org.chiskien.linked_list.Node;

public class StackLinkedList<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    private Node<T> top;

    public StackLinkedList() {
        top = null;
    }

    public StackLinkedList(Node<T> top) {
        this.top = top;
    }

    public void push(Node<T> newNode) {
        if (!isEmpty()) {
            newNode.setNext(top);
        }
        top = newNode;
    }

    public Node<T> pop() {
        Node<T> n = top;
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return null;
        } else {
            top.setNext(null);
            top = top.getNext();
        }
        return n;
    }

    public boolean isEmpty() {
        return (top == null);
    }

}

class Main {

    public static void main(String[] args) {
        StackLinkedList<Integer> stackLinkedList = new StackLinkedList<>();

    }
}