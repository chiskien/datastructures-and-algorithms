package org.chiskien.leetcode.sorting;

public class InsertionSort {
    private InsertionSort() {
    }

    private static InsertionSort instance = null;

    public static InsertionSort getInstance() {
        if (instance == null) {
            instance = new InsertionSort();
        }
        return instance;
    }

}
