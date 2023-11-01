package chiskien.datastructures_algorithms.leetcode.twopointers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    SortArrayByParity sortArrayByParity;

    @BeforeEach
    void setUp() {
        sortArrayByParity = new SortArrayByParity();
    }

    @AfterEach
    void tearDown() {
        System.gc();
    }

    @Test
    void sortArrayByParity() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(new int[]{8, 2, 6,4,5,3,7,1}, sortArrayByParity.sortArrayByParity(nums));
    }
}