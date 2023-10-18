package chiskien.datastructures_algorithms.codility;

public class SmallestMissingPositiveNumber {



    public static int solution(int[] A) {
        boolean[] seen = new boolean[1000001];
        for (int j : A) {
            if (j > 0) {
                seen[j] = true;
            }
        }
        for (int i = 1; i <= 1000000; i++) {
            if (!seen[i]) {
                return i;
            }
        }
        return 1;
    }
}

