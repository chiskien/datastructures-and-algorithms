package chiskien.datastructures_algorithms.leetcode.array.practices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {
    PlusOne po = new PlusOne();

    @Test
    void plusOne() {
        int[] array = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 4};
        assertArrayEquals(expected, po.plusOne(array));
    }

    @Test
    void fullNines() {
        int[] array = new int[]{9, 9, 9, 9, 9, 9, 9, 9};
        int[] expected = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, po.plusOne(array));
    }
}