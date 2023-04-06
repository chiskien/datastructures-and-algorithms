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

    @Override
    public String toString() {
        return traverse();
    }
}
