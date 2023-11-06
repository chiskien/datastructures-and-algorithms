package chiskien.datastructures_algorithms.leetcode.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
    InsertionSort insertionSort;

    @BeforeEach
    void setUp() {
        insertionSort = new InsertionSort();
    }

    @Test
    void test1() {
        int[] nums = new int[]{2, 3, 1, 6, 8, 10, 22, 21, 4};
        nums = insertionSort.insertionSort(nums);

    }
}