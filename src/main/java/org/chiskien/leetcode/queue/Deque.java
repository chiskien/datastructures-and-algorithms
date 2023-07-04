package org.chiskien.leetcode.queue;

import org.chiskien.leetcode.linked_list.DoublyLinkedList;

import java.util.Iterator;

public class Deque<T> implements Iterable<T> {
    DoublyLinkedList<T> queue;

    public Deque() {
        queue = new DoublyLinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
