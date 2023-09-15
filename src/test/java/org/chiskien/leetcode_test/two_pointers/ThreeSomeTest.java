package org.chiskien.leetcode_test.two_pointers;

import org.chiskien.datastructures_algorithms.leetcode.two_pointers.ThreeSome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThreeSomeTest {
    ThreeSome threeSome;

    @BeforeEach
    void setUp() {
        threeSome = new ThreeSome();
    }

    @Test
    void threeSome() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        threeSome.threeSome(nums);
    }
}