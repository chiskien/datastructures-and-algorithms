package org.chiskien.codility;

import java.util.Arrays;

public class OddOccurences {

    public static void main(String[] args) {
        int[] A = new int[]{9, 9, 3, 3, 9, 9, 10, 1, 1, 2, 2};
        System.out.println(solution(A));

    }

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
