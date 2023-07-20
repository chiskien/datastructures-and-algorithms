package org.chiskien.leetcode.queue;

import org.chiskien.leetcode.linked_list.DoublyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DequeCK<T> implements Iterable<T> {
    DoublyLinkedList<T> queue;

    public DequeCK() {
        queue = new DoublyLinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void addFirst(T item) {
        queue.addFirst(item);
    }

    public void addLast(T item) {
        queue.addLast(item);
    }


    @Override
    public Iterator<T> iterator() {
        throw new NoSuchElementException();
    }

}
