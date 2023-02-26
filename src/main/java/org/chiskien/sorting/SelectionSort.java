package org.chiskien.sorting;

import java.util.ArrayList;
import java.util.List;

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

    public List<Integer> selectionSort(List<Integer> inputList) {
        int n = inputList.size();
        List<Integer> result = new ArrayList<>(n);
        int smallestOfArrayInput;
        for (int i = 0; i < n; i++) {
            smallestOfArrayInput = findSmallestItem(inputList);
            result.add(inputList.get(smallestOfArrayInput));
            inputList.remove(smallestOfArrayInput);
        }
        return result;
    }

    public int findSmallestItem(List<Integer> inputList) {
        int smallest = inputList.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) < smallest) {
                smallest = inputList.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
