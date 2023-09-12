package org.chiskien.datastructures_algorithms.codility;

import java.util.Arrays;

public class OddOccurences {


    public static int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        } else {
            Arrays.sort(A);
            int i;
            for (i = 0; i < A.length - 1; i += 2) {
                if (A[i] != A[i + 1]) {
                    break;
                }

            }
            return A[i];
        }
    }
}
