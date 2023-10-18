package chiskien.datastructures_algorithms.leetcode.linked_list.implementations;

import java.util.Iterator;

public class SinglyLinkedList<T> implements LinkedList<T> {

    public int size;
    public SingleNode<T> head;
    public SingleNode<T> tail;

    public SinglyLinkedList() {
        this.head = this.tail = null;
        size = 0;
    }


    public void addLast(T data) {
        SingleNode<T> singleNode = new SingleNode<>(data);
        addLast(singleNode);
    }




    public void addFirst(T data) {
        SingleNode<T> singleNode = new SingleNode<>(data);
        addFirst(singleNode);
    }

    public void addLast(SingleNode<T> newSingleNode) {
        if (isEmpty()) {
            head = tail = newSingleNode;
        } else if (head.getNext() == null) {
            tail = newSingleNode;
            head.setNext(tail);
        } else {
            tail.setNext(newSingleNode);
            tail = newSingleNode;
        }
    }
    public void addFirst(SingleNode<T> newSingleNode) {
        if (isEmpty()) {
            head = tail = newSingleNode;
        } else {
            newSingleNode.setNext(head);
            head = newSingleNode;
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
        SingleNode<T> n = head;
        head = n.getNext();
        return n.getData();
    }


    public T removeLast() {
        if (isEmpty()) return null;
        SingleNode<T> n = head;
        while (n.getNext() != tail) {
            n = n.getNext();
        }
        SingleNode<T> singleNodeTail = n.getNext();
        n.setNext(null);
        tail = n;
        return singleNodeTail.getData();
    }

    public String traverse() {
        StringBuilder output = new StringBuilder();
        if (isEmpty()) {
            output.append("LinkedList is empty");
        } else {
            SingleNode<T> n = head;
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
        SingleNode<T> newSingleNode = new SingleNode<>(data);
        int i = 1;
        SingleNode<T> n = head;
        while (i != k) {
            n = n.getNext();
            i++;
        }
    }

    public SingleNode<T> searchNode(T key) {
        if (isEmpty()) return null;
        SingleNode<T> n = head;
        while (n != null && n.getData() != key) {
            n = n.getNext();
        }
        return n;
    }

    public void removeDuplicateNode(SingleNode<T> n) {
        while (n != null) {
            SingleNode<T> nextDistinct = n.getNext();
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

