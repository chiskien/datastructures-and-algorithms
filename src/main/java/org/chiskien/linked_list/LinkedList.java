package org.chiskien.linked_list;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    public int size;

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

    public LinkedList() {
        this.head = this.tail = null;
        size = 0;
    }

    public LinkedList(T data) {
        head = tail = new Node<>(data);
        size = 1;
    }

    public void addToTail(T data) {
        Node<T> node = new Node<>(data);
        addToTail(node);
    }

    public void addToHead(T data) {
        Node<T> node = new Node<>(data);
        addToHead(node);
    }


    private void addToTail(Node<T> newNode) {
        if (isEmpty()) {
            head = tail = newNode;
        } else if (head.getNext() == null) {
            tail = newNode;
            head.setNext(tail);
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size = size + 1;
    }

    private void addToHead(Node<T> newNode) {
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size = size + 1;
    }


    public boolean isEmpty() {
        return (head == null);
    }

    public Node<T> removeFromHead() {
        if (isEmpty()) return null;
        Node<T> n = head;
        n = n.getNext();
        size = size - 1;
        return n;
    }

    public Node<T> removeFromTail() {
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

    public void traverse() {
        if (isEmpty()) System.out.println("Linkedlist is empty");
        Node<T> n = head;
        while (n != null) {
            System.out.print(n.getData() + "-->");
            n = n.getNext();
        }
        System.out.print("end");
        System.out.println();
    }

    @Override
    public String toString() {
        return "LinkedList{" + "head=" + head + ", tail=" + tail + '}';
    }
}
