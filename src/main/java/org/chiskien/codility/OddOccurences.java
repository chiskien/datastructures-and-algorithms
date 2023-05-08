package org.chiskien.codility;

import java.util.Arrays;

public class OddOccurences {

    public static void main(String[] args) {
        int[] A = new int[]{9, 9, 3, 3, 9, 9, 7};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        return 1;
    }
}
