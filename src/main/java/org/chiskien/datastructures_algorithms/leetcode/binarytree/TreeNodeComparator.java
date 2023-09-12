package org.chiskien.datastructures_algorithms.leetcode.binarytree;

import java.util.Comparator;

public class TreeNodeComparator<T extends Comparable<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
