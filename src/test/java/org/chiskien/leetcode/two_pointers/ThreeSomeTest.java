package org.chiskien.leetcode.two_pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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