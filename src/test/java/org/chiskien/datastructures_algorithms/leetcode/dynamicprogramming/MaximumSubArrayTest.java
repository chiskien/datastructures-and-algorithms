package org.chiskien.datastructures_algorithms.leetcode.dynamicprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArrayTest {
    MaximumSubArray maximumSubArray;

    @BeforeEach
    void setUp() {
        maximumSubArray = new MaximumSubArray();
    }

    @Test
    void maxSubArray() {
        int[] nums = new int[]{-1, -2};
        assertEquals(-1, maximumSubArray.maxSubArray(nums));
    }
}