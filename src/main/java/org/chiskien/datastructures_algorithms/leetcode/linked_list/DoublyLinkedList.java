package org.chiskien.datastructures_algorithms.leetcode.linked_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements LinkedList<T> {

    public DoublyNode<T> head;
    public DoublyNode<T> tail;
    public int size;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(T item) {
        if (item == null) throw new IllegalArgumentException("item is null");
        DoublyNode<T> newNode = new DoublyNode<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    @Override
    public void addLast(T item) {
        if (item == null) throw new IllegalArgumentException("item is null");
        DoublyNode<T> newNode = new DoublyNode<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeNode(DoublyNode<T> nodeTobeDeleted) {
        nodeTobeDeleted.next.prev = nodeTobeDeleted.prev;
        nodeTobeDeleted.prev.next = nodeTobeDeleted.next;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        T data = head.data;
        if (head == tail) {
            head = tail = null;
            return data;
        } else {
            DoublyNode<T> next = head.next;
            next.prev = null;
            head = next;
        }
        return data;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        T data = tail.data;
        if (head == tail) {
            head = tail = null;
            return data;
        } else {
            DoublyNode<T> n = head;
            while (n.next != tail) {
                n = n.next;
            }
            tail.prev = null;
            n.next = null;
            tail = n;
        }
        return data;
    }

    @Override
    public String traverse() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        if (isEmpty()) return null;
        Collection<T> collection = new ArrayList<>();
        DoublyNode<T> n = head;
        while (n != null) {
            collection.add(n.data);
            n = n.next;
        }
        return collection.iterator();
    }

}

class DoublyNode<T> {
    public DoublyNode<T> next;
    public DoublyNode<T> prev;
    public T data;

    public DoublyNode(DoublyNode<T> next, DoublyNode<T> prev, T data) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    public DoublyNode(T data) {
        this.data = data;
        next = prev = null;
    }
}


