package chiskien.datastructures_algorithms.linkedlist.implementations;

import java.util.Iterator;

public interface LinkedList<T> {

    boolean isEmpty();

    int size();

    void addFirst(T item);

    void addLast(T item);

    T removeFirst();

    T removeLast();

    String traverse();

    Iterator<T> iterator();
}
