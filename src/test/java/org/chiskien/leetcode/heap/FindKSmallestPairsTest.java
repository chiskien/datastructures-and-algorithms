package org.chiskien.leetcode.heap;

import org.chiskien.datastructures_algorithms.leetcode.heap.FindKSmallestPairs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindKSmallestPairsTest {
    FindKSmallestPairs findKSmallestPairs;

    @BeforeEach
    void setUp() {
        findKSmallestPairs = new FindKSmallestPairs();
    }

    @Test
    void test1() {
        int[] nums1 = new int[]{1, 7, 11};
        int[] nums2 = new int[]{2, 4, 6};
        int k = 3;
        var result = findKSmallestPairs.kSmallestPair(nums1, nums2, k);
        var expected = List.of(List.of(1, 2), List.of(1, 4), List.of(1, 6));
        assertEquals(expected, result);
    }
    @Test
    void test2() {
        int[] nums1 = new int[]{1, 1, 2};
        int[] nums2 = new int[]{1, 2, 3};
        int k = 2;
        var result = findKSmallestPairs.kSmallestPair(nums1, nums2, k);
        var expected = List.of(List.of(1, 1), List.of(1, 1));
        assertEquals(expected, result);
    }
}