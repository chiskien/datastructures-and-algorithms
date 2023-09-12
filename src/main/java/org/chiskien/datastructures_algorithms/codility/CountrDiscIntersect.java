package org.chiskien.datastructures_algorithms.codility;

public class CountrDiscIntersect {


    public static int solution(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            //if the radius * 2 >  distance (2 point)
            for (int j = i + 1; j <= A.length - 1; j++) {
                int distance = Math.abs(j - i);
                int diameter = A[i] + A[j];
                if (diameter >= distance) {
                    count++;
                }
            }
            if (count >= 1000000) {
                return -1;
            }
        }
        return count;
    }
}
