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

    public int[] selectionSort(int[] arrayInput) {
        return arrayInput;
    }

    public int findSmallestItem(int[] arrayInput) {
        int smallest = arrayInput[0];
        int smallestIndex = 0;
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] < smallest) {
                smallestIndex = i;
            }
        }
        return smallest;
    }
}
