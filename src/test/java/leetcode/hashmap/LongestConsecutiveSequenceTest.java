package leetcode.hashmap;

import chiskien.datastructures_algorithms.leetcode.hashmap.LongestConsecutiveSequence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence longestConsecutiveSequence;

    @BeforeEach
    void setUp() {
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }

    @Test
    void longestConsecutive() {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        assertEquals(4, longestConsecutiveSequence.longestContainedRange(nums));

    }

    @Test
    void longestContainedRange() {
    }
}