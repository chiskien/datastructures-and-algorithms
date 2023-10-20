package chiskien.datastructures_algorithms.leetcode.math;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public int[] plusOneEPI(int[] digits) {
        int n  = digits.length - 1;
        digits[n] = digits[n] + 1;
        for (int i = n; i > 0 && digits[i] == 10; i--) {
            digits[i] = 0;
            digits[i-1] = digits[i-1] + 1;
        }
        if (digits[0] == 10) {
            digits[0] = 0;
            digits = Arrays.copyOf(digits, digits.length + 1);
            digits[0] = 1;
        }
        return digits;
    }
}
