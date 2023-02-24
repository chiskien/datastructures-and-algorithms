package org.chiskien.sorting;

public class SelectionSort {

    private SelectionSort() {
    }

    private static SelectionSort instance = null;

    public static SelectionSort getInstance() {
        if (instance == null) {
            instance = new SelectionSort();
        }
        return instance;
    }

    public static
}
