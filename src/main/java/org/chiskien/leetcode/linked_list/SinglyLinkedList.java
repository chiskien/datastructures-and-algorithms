package org.chiskien.leetcode.linked_list;

import java.util.Iterator;

public class SinglyLinkedList<T> implements LinkedList<T> {

    public int size;
    public Node<T> head;
    public Node<T> tail;

    public SinglyLinkedList() {
        this.head = this.tail = null;
        size = 0;
    }


    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        addLast(node);
    }




    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        addFirst(node);
    }

    public void addLast(Node<T> newNode) {
        if (isEmpty()) {
            head = tail = newNode;
        } else if (head.getNext() == null) {
            tail = newNode;
            head.setNext(tail);
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public void addFirst(Node<T> newNode) {
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }


    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public int size() {
        return 0;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        Node<T> n = head;
        head = n.getNext();
        return n.getData();
    }


    public T removeLast() {
        if (isEmpty()) return null;
        Node<T> n = head;
        while (n.getNext() != tail) {
            n = n.getNext();
        }
        Node<T> nodeTail = n.getNext();
        n.setNext(null);
        tail = n;
        return nodeTail.getData();
    }

    public String traverse() {
        StringBuilder output = new StringBuilder();
        if (isEmpty()) {
            output.append("LinkedList is empty");
        } else {
            Node<T> n = head;
            while (n != null) {
                output.append(n.getData()).append("-->");
                n = n.getNext();

            }
            output.append("end").append("\n");
        }
        return output.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    public int getSize() {
        while (head != null) {
            size++;
            head = head.getNext();
        }
        return size;
    }

    public void insertNodeAtIndex(T data, int k) {
        Node<T> newNode = new Node<>(data);
        int i = 1;
        Node<T> n = head;
        while (i != k) {
            n = n.getNext();
            i++;
        }
    }

    public Node<T> searchNode(T key) {
        if (isEmpty()) return null;
        Node<T> n = head;
        while (n != null && n.getData() != key) {
            n = n.getNext();
        }
        return n;
    }

    public void removeDuplicateNode(Node<T> n) {
        while (n != null) {
            Node<T> nextDistinct = n.getNext();
            while (nextDistinct != null && n.getData() != nextDistinct.getData()) {
                nextDistinct = nextDistinct.getNext();
            }
            n.setNext(nextDistinct);
            n = nextDistinct;
        }
    }

    @Override
    public String toString() {
        return traverse();
    }
}

class Node<T> {
    private Node<T> next;
    private T data;

    public Node(T data) {
        this.next = null;
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node with data: " + data;
    }
}
