package chiskien.datastructures_algorithms.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubArrayAtMostKFrequencyTest {
    LengthOfLongestSubArrayAtMostKFrequency lOfA;


    @BeforeEach
    void setUp() {
        lOfA = new LengthOfLongestSubArrayAtMostKFrequency();

    }

    @Test
    void longestSubArray() {
        int[] arr = {1, 2, 3, 3, 2, 1, 4, 2, 2};
        assertEquals(6, lOfA.longestSubArray(arr, 2));
    }
}