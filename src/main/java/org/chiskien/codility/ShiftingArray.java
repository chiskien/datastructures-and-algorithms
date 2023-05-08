package org.chiskien.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftingArray {
    public static void main(String[] args) {
        int[] test = new int[]{};
        int k = 5;
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(20);
//        String array = Arrays.toString(shiftLeft(test, k));
        System.out.println(shiftLeft(list, k));
    }

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
