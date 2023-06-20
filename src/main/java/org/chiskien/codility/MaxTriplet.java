package org.chiskien.codility;

import java.util.ArrayList;
import java.util.List;

public class MaxTriplet {
    public static void main(String[] args) {
        int[] A = new int[]{-3, 1, 2, -2, 5, 6};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        List<Integer> Alist = new ArrayList<>();
        for (Integer integer : A) {
            Alist.add(integer);
        }
        List<Integer> listOfMax = new ArrayList<>(3);
        int count = 0;
        while (count < 3) {
            int max = Alist.get(0);
            int j = 0;
            while (j <= Alist.size() - 1) {
                if (Alist.get(j) > max) {
                    max = Alist.get(j);
                }
                j++;
            }
            Alist.remove((Integer) max);
            listOfMax.add(max);
            count++;

        }
        int product = 1;
        for (Integer num : listOfMax) {
            product *= num;
        }
        return product;
    }
}