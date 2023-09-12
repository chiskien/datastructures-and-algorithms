package org.chiskien.datastructures_algorithms.leetcode.string;

public class ReplaceAndRemove {



    //Remove entry containing 'b'
    // Replace 'a' with two 'd'
    public static int replaceAndRemove(int size, char[] s) {
        int writeIndex = 0, aCount = 0;
        for (int i = 0; i < size; i++) {
            if (s[i] != 'b') {
                s[writeIndex++] = s[i];
            }
            if (s[i] == 'a') {
                aCount++;
            }
        }
        int currentIndex = writeIndex - 1;
        return 1;
    }
}
