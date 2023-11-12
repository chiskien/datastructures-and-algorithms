package chiskien.datastructures_algorithms.leetcode.array.practices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDuplicateTest {
    DeleteDuplicate deleteDuplicate;

    @BeforeEach
    void setUp() {
        deleteDuplicate = new DeleteDuplicate();
    }

    @Test
    void deleteDuplicates() {
        int[] nums = new int[]{1,2,3,4,5,5,5,6,7,7};
        assertEquals(7, deleteDuplicate.deleteDuplicates(nums));
    }
}