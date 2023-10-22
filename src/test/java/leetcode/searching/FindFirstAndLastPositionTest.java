package leetcode.searching;

import chiskien.datastructures_algorithms.leetcode.searching.FindFirstAndLastPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionTest {
    FindFirstAndLastPosition ffal = new FindFirstAndLastPosition();
    @Test
    void findFirst() {
        int[] nums = new int[]{5,7,7,8,8,10};
        assertEquals(3, ffal.findFirst(nums, 8));
    }
}