package leetcode.searching;

import chiskien.datastructures_algorithms.leetcode.searching.FindMinimumInRotatedSortedArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {
    FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray;

    @BeforeEach
    void setUp() {
        findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
    }

    @AfterEach
    void tearDown() {
        System.gc();
    }

    @Test
    void search() {
        int[] nums = new int[]{5, 6, 7, 1, 2, 3, 4};
        assertEquals(3, findMinimumInRotatedSortedArray.search(nums));
    }
}