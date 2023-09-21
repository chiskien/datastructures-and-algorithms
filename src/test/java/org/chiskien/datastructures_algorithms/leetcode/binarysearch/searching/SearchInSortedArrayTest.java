package org.chiskien.datastructures_algorithms.leetcode.binarysearch.searching;

import org.chiskien.datastructures_algorithms.leetcode.searching.SearchInSortedArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInSortedArrayTest {
    SearchInSortedArray searchInSortedArray;

    @BeforeEach
    void setUp() {
        searchInSortedArray = new SearchInSortedArray();
    }

    @Test
    void search() {
        int[] nums = new int[]{5, 6, 7, 0, 1, 2, 3};
        int target = 6;
        assertEquals(1, searchInSortedArray.search(nums, target));
    }

    @Test
    void search1() {
        int[] nums = new int[]{4,5,6,7,8,9,1,2,3};
        int target = 2;
        assertEquals(7, searchInSortedArray.search(nums, target));
    }

    @Test
    void search2() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        int target = 4;
        assertEquals(3, searchInSortedArray.search(nums, target));
    }
}