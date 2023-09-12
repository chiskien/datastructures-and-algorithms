package org.chiskien.datastructures.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftingArray {

    public static int[] solution(int[] arr, int d) {
        if (arr.length == 0) return arr;
        for (int i = 0; i < d; i++) {
            int j;
            int last = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = last;
        }
        return arr;
    }

    public static List<Integer> shiftLeft(List<Integer> arr, int d) {
        for (int i = 0; i < d; i++) {
            int j;
            int first = arr.get(0);
            for (j = 0; j < arr.size() - 1; j++) {
                arr.set(j, arr.get(j + 1));
            }
            arr.set(j, first);
        }
        return arr;
    }
}
