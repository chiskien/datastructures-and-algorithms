package org.chiskien.datastructures_algorithms.leetcode.searching;

public class SearchIn2DSortedArray {


    public static boolean matrixSearch(int[][] nums, int key) {
        int row = 0;
        int col = nums[0].length - 1; //top-right corner

        //Keep searching
        while (row < nums.length && col >= 0) {
            if (nums[row][col] == key) {
                return true;
            } else if (nums[row][col] < key) {
                ++row;
            } else {
                --col;
            }
        }
        return false;
    }
}
