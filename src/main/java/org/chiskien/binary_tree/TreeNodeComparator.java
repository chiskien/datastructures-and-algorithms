package org.chiskien.binary_tree;

import java.util.Comparator;

public class TreeNodeComparator<T extends Comparable<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
