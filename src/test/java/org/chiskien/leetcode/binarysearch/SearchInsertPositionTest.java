package org.chiskien.leetcode.binarysearch;

import org.chiskien.leetcode.searching.SearchInsertPosition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    SearchInsertPosition searchInsertPosition;

    @BeforeEach
    void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    void searchInsert() {
        int[] nums = new int[]{1,3,5,6};
        int value = 2;
        assertEquals(1, searchInsertPosition.searchInsert(nums, value));
    }
}