package org.chiskien.codility;

import java.util.Arrays;

public class ShiftingArray {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4};
        int k = 5;
        String array = Arrays.toString(solution(test, k));
    }

    public static int[] solution(int[] A, int K) {
        for (int i = 0; i < K; i++) {
            int j;
            int last = A[A.length - 1];
            for (j = A.length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[j] = last;
        }
        return A;
    }
}
