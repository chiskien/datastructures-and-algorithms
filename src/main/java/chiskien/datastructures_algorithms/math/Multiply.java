package chiskien.datastructures_algorithms.math;

import java.util.Arrays;
import java.util.Collections;

public class Multiply {

    //6.3 Multiply two arbitrary-precision integers
    public int[] multiply(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        for (int i = nums1.length - 1; i >= 0; i--) {
            for (int j = nums2.length - 1; j >= 0; j--) {
                result[i+j+1] = result[i+j+1] + nums1[i] * nums2[j];
                result[i+j] = result[i+j] + result[i+j+1] / 10;
                result[i+j+1] = result[i+j+1] % 10;
            }
        }
        //remove trailing zeroes
        int firstNotZero = 0;
        while (firstNotZero < result.length && result[firstNotZero] == 0) {
            firstNotZero++;
        }
        result = Arrays.copyOfRange(result, firstNotZero, result.length);

        return result;
    }
}
