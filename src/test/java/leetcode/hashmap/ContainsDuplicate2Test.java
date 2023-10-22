package leetcode.hashmap;

import chiskien.datastructures_algorithms.leetcode.hashmap.ContainsDuplicate2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicate2Test {
    ContainsDuplicate2 containsDuplicate2;

    @BeforeEach
    void setUp() {
        containsDuplicate2 = new ContainsDuplicate2();
    }

    @Test
    void containsNearbyDuplicate() {
        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        boolean result = containsDuplicate2.containsNearbyDuplicate(nums, k);
        assertTrue(result);
    }

    @Test
    void normalCase() {
        int[] nums = new int[]{1, 0, 1, 1};
        int k = 1;
        boolean result = containsDuplicate2.containsNearbyDuplicate(nums, k);
        assertTrue(result);
    }

    @Test
    void falseCase() {
        int[] nums = new int[]{1,2,3,1,2,3};
        int k = 2;
        boolean result = containsDuplicate2.containsNearbyDuplicate(nums, k);
        assertFalse(result);
    }
}