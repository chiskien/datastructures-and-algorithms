package org.chiskien.datastructures_algorithms.codility;

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


    public static int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int maxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                Arrays.fill(result, findMax(result));
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

