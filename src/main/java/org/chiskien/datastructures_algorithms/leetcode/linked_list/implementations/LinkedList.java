package org.chiskien.datastructures_algorithms.leetcode.linked_list.implementations;

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
