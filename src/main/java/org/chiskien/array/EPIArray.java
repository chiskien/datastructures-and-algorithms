package org.chiskien.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EPIArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 5, 6, 87, 55, 5, 6, 8};
    }

    //problem: take an arrays of integers then
    public static int[] evenOdd(int[] A) {
        int nextEven = 0;
        int nextOdd = A.length - 1;
        while (nextEven < nextOdd) {
            if (A[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp;
            }
        }
        return A;
    }

    //6.1: The Dutch National Flag Problem

    public enum Color {RED, WHITE, BLUE}

    public static void dutchFlagPartition(int pivotIndex, List<Color> A) {
        Color pivot = A.get(pivotIndex);
        //First pass: group elements smaller than pivot
        for (int i = 0; i < A.size(); ++i) {
            //Look for smaller item
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(j).ordinal() < pivot.ordinal()) {
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }

        for (int i = A.size() - 1; i >= 0 && A.get(i).ordinal() >= pivot.ordinal(); i--) {
            //Look for a larger element. Stop when we reach an element less than pivot

            for (int j = i - 1; j >= 0 && A.get(j).ordinal() >= pivot.ordinal(); j--) {
                if (A.get(j).ordinal() > pivot.ordinal()) {
                    Collections.swap(A, i, j);
                }
            }
        }
    }

}
