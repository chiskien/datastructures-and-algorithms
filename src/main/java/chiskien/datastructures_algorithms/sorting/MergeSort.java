package chiskien.datastructures_algorithms.sorting;

import chiskien.designpatterns.strategy.mygame.Weapon;

public class MergeSort {

    //Recursion, Array, Sorting, Divide and Conquer

    public static void main(String[] args) {

    }

    public static void sort(int[] array, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (upperBound + lowerBound) / 2;
            sort(array, lowerBound, mid);
            sort(array, mid + 1, upperBound);
//            merge();
        }

    }

    public static void merge(int[] sortedArrayA, int[] sortedArrayB,
                             int[] auxiliary) {
        int aIndex = 0, bIndex = 0, auxIndex = 0;
        int aLength = sortedArrayA.length;
        int bLength = sortedArrayB.length;
        while (aIndex < aLength && bIndex < bLength) {
            if (sortedArrayA[aIndex] < sortedArrayB[bIndex]) {
                auxiliary[auxIndex++] = sortedArrayA[aIndex++];
            } else {
                auxiliary[auxIndex++] = sortedArrayB[bIndex++];
            }
        }
        while (aIndex < aLength) {
            auxiliary[auxIndex++] = sortedArrayA[aIndex++]; //merge remaining
        }
        while (bIndex < bLength) {
            auxiliary[auxIndex++] = sortedArrayB[bIndex++];
        }

    }
}
