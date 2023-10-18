package chiskien.datastructures_algorithms.codility;

public class FrogCross {


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
