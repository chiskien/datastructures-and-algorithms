package chiskien.datastructures_algorithms.codility;


import java.util.Arrays;

public class PermMissingElement {



    public static int realSolution(int[] A) {
        if (A.length == 0) {
            return 1;
        } else if (A.length == 1) {
            return A[0];
        } else {
            Arrays.sort(A);
            if (A[0] != 1) {
                return 1;
            }
            int i;
            for (i = 0; i < A.length; i++) {
                if (i == A.length - 1) {
                    break;
                }
                if (A[i + 1] != A[i] + 1) {
                    break;
                }
            }
            return A[i] + 1;
        }
    }
}
