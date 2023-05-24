package org.chiskien.codility;

public class SmallestMissingPositiveNumber {

    public static void main(String[] args) {
        int[] a = new int[]{-11, -3, -6, -4, 1, 2};
        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        boolean[] seen = new boolean[100001];
        for (int j : A) {
            if (j > 0) {
                seen[j] = true;
            }
        }
        for (int i = 1; i <= 100000; i++) {
            if (!seen[i]) {
                return i;
            }
        }
        return 1;
    }
}

