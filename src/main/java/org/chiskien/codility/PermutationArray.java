package org.chiskien.codility;

import java.util.Arrays;

public class PermutationArray {


    public static int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        } else if (A.length == 1) {
            return 0;
        } else {
            Arrays.sort(A);
            if (A[0] != 1) {
                return 0;
            } else {
                int i;
                for (i = 0; i < A.length; i++) {
                    if (i == A.length - 1) {
                        break;
                    }
                    if (A[i + 1] != A[i] + 1) {
                        return 0;
                    }
                }
            }
            return 1;
        }
    }
}
