package org.chiskien.leetcode.queue;

import org.chiskien.leetcode.linked_list.DoublyLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<T> implements Iterable<T> {
    DoublyLinkedList<T> queue;

    public Deque() {
        queue = new DoublyLinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void addFirst() {

    }

    public void addLast() {

    }

    @Override
    public Iterator<T> iterator() {
        throw new NoSuchElementException();
    }

}
