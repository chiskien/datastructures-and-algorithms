package org.chiskien.datastructures_algorithms.codility;

import java.util.Arrays;

public class CountDistinc {



    public static int solution(int[] A) {
        return Arrays.stream(A).distinct().toArray().length;
    }
}