package org.chiskien.codility;

import java.util.Arrays;

public class OddOccurences {

    public static void main(String[] args) {
        int[] A = new int[]{9, 9, 3, 3, 9, 9, 7};
        solution(A);

    }

    public static void solution(int[] A) {
        Arrays.sort(A);
        int i;
        for (i = 0; i < A.length; i += 2) {
            if (A[i] != A[i + 1]) {
                break;
            }
        }
        System.out.println(A[i]);
    }
}
