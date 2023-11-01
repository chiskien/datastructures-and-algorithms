package chiskien.datastructures_algorithms.leetcode.queue;

import chiskien.datastructures_algorithms.leetcode.linkedlist.implementations.DoublyLinkedList;

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
