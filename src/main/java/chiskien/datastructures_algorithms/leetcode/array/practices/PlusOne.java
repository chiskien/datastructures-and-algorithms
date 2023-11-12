package chiskien.datastructures_algorithms.leetcode.array.practices;

import java.util.Arrays;

public class PlusOne {

    //Given an array forming an integer
    //return that integer + 1
    //[1,2,0] -> [1,2,1]
    //[9,9] -> [1,0,0]

    public int[] plusOne(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            int i1 = array[i];
            if (i1 < 9) {
                array[i] = array[i] + 1;
                return array;
            } else {
                array[i] = 0;
            }
        }
        //only when array contains all 9 and exceeds its length
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[0] = 1;
        return newArray;
    }

    //variant
    //Writes a java program which takes as input two strings s and t of bits encoding binary numbers Bs and B, respectively, and returns a new string of bits representing the number Bs + Bt
}
