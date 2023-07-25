package org.chiskien.leetcode.searching;

import java.util.Arrays;

public class Demo {


    public static void main(String[] args) {
        int[] a = new int[]{1, 23, 3, 5625, 2, 51};
        int result = Arrays.binarySearch(a, 23);
        System.out.println(result);
    }
}
