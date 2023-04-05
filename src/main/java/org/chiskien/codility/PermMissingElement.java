package org.chiskien.codility;


public class PermMissingElement {
    public static void main(String[] args) {
        int[] A = new int[]{2, 3, 1, 5};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int missingNumber;
        int n = A.length;
        //sum for a continuous sequence is (Largest + Smallest)*Numbers of Items then divide by two
        //because A is an array with distinct elements then Largest is equals to A.length
        int sum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int j : A) {
            actualSum += j;
        }
        missingNumber = sum - actualSum;
        return missingNumber;
    }
}
