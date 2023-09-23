package org.chiskien.datastructures_algorithms.leetcode.searching;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class FindMinAndMaxSimultaneouslyTest {
    FindMinAndMaxSimultaneously findMinandMaxSimultaneously;

    @BeforeEach
    void setUp() {
        findMinandMaxSimultaneously = new FindMinAndMaxSimultaneously();
    }

    @AfterEach
    void tearDown() {
        System.gc();
    }

    @Test
    void findMinMax() {
        int[] nums = new int[]{5, 1, 6, 7, 8, 94, 2, 32, 6666, 22};
        int[] expected = new int[]{1, 6666};
        assertArrayEquals(expected, findMinandMaxSimultaneously.findMinMax(nums));
    }

    @Test
    void findMinMaxAbnormalCase() {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] expected = new int[]{1, 1};
        assertArrayEquals(expected, findMinandMaxSimultaneously.findMinMax(nums));
    }

    @Test
    void findMinMaxEmptyArray() {
        int[] nums = new int[0];
        int[] expected = new int[0];
        assertArrayEquals(expected, findMinandMaxSimultaneously.findMinMax(nums));
    }
}