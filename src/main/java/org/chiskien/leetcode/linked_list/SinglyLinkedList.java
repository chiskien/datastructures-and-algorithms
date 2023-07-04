package org.chiskien.leetcode.linked_list;

public class SinglyLinkedList<T> {

    public int size;
    private Node<T> head;
    private Node<T> tail;

    public SinglyLinkedList() {
        this.head = this.tail = null;
        size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public void addToTail(T data) {
        Node<T> node = new Node<>(data);
        addToTail(node);
    }

    public void addToHead(T data) {
        Node<T> node = new Node<>(data);
        addToHead(node);
    }


    public void addToTail(Node<T> newNode) {
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

    public void addToHead(Node<T> newNode) {
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

    public Node<T> removeHead() {
        if (isEmpty()) return null;
        Node<T> n = head;
        head = n.getNext();
        return n;

    }

    public Node<T> removeTail() {
        if (isEmpty()) return null;
        Node<T> n = head;
        while (n.getNext() != tail) {
            n = n.getNext();
        }
        Node<T> nodeTail = n.getNext();
        n.setNext(null);
        tail = n;
        return nodeTail;
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
