package org.chiskien.codility;

import java.util.Arrays;

public class MaxCounter {

    /* Problem:
    - N: number of counters
    - A: Array input
    - Assumptions:
        + N and M are in range [1,100 000]
        + Each element of array A is in range (1, N+1)
    if an item within range (1, N) then increase X
    * */
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 2, 3, 1, 4, 3, 4, 4, 5};
        int N = 4;
        System.out.println(Arrays.toString(solution(N, A)));

    }

    public static int[] solution(int N, int[] A) {
        int[] result = new int[N];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                int maxCounter = findMax(result);
                Arrays.fill(result, maxCounter);
            } else {
                result[A[i] - 1]++;
            }
        }
        return result;
    }

    public static int findMax(int[] inputList) {
        Arrays.sort(inputList);
        return inputList[inputList.length - 1];
    }


}


