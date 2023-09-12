package org.chiskien.leetcode.binarysearch;

import org.chiskien.datastructures.leetcode.searching.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void binarySearch() {
        int[] nums = new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10};
        int value = 4;
        assertEquals(3, binarySearch.binarySearch(nums, value));
    }

    @Test
    void binarySearch2() {
        int[] nums = new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10};
        int value = 5;
        assertEquals(-1, binarySearch.binarySearch(nums, value));
    }
}