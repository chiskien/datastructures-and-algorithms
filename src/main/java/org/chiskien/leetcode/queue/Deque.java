package org.chiskien.leetcode.queue;

import org.chiskien.leetcode.linked_list.LinkedList;
import org.chiskien.leetcode.linked_list.SinglyLinkedList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Deque<T> implements Iterable<T> {
    SinglyLinkedList<T> queue;

    public Deque() {
        queue = new SinglyLinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
