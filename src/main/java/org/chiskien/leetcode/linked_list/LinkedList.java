package org.chiskien.leetcode.linked_list;

import java.util.Iterator;

interface LinkedList<T> {

    boolean isEmpty();

    int size();

    void addFirst(T item);

    void addLast(T item);

    T removeFirst();

    T removeLast();

    String traverse();

    Iterator<T> iterator();
}
