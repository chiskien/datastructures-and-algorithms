package org.chiskien.sorting;

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

    public int[] quickSort(int[] input) {
        if (input.length < 2) {
            return input;
        } else {

        }
        return input;
    }

}
