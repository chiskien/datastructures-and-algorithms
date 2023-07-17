package org.chiskien.leetcode.sorting;

public class SelectionSort {

    public int[] selectionSort(int[] inputList) {
        int n = inputList.length;
        int[] result = new int[n];
        int indexOfSmallestItem;
        for (int i = 0; i < n; i++) {
            indexOfSmallestItem = findIndexOfSmallestItem(inputList);
            result[i] = inputList[indexOfSmallestItem];
            inputList[indexOfSmallestItem] = inputList[indexOfSmallestItem + 1];
        }
        return result;
    }

    public int findIndexOfSmallestItem(int[] inputList) {
        int smallest = inputList[0];
        int smallestIndex = 0;
        for (int i = 0; i < inputList.length; i++) {
            if (inputList[i] < smallest) {
                smallest = inputList[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
