package org.chiskien.codility;

import java.util.Arrays;

public class CountDistinc {

    public static void main(String[] args) {
        int[] A = new int[]{1, 12, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        return Arrays.stream(A).distinct().toArray().length;
    }
}
