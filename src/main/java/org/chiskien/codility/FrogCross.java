package org.chiskien.codility;

public class FrogCross {
    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 2, 2, 4, 2, 5};
        int X = 7;
        System.out.println(solution(X, A));
    }

    public static int solution(int X, int[] A) {
        int[] counter = new int[X + 1];
        int location = 0;
        for (int i = 0; i < A.length; i++) {
            if (counter[A[i]] == 0) {
                counter[A[i]] = A[i];
                location++;
                if (location == X) {
                    return i;
                }
            }
        }
        return -1;
    }
}
