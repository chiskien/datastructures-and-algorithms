package org.chiskien.sorting;

import java.util.List;

public class QuickSort {
    private QuickSort() {
    }

    private static QuickSort instance = null;

    public static QuickSort getInstance() {
        if (instance == null) {
            instance = new QuickSort();
        }
        return instance;
    }

    public List<Integer> quickSort(List<Integer> input) {
        if (input.size() < 2) {
            return input;
        } else {

        }
        return input;
    }

}
