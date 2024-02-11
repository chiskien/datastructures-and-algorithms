package chiskien.datastructures_algorithms.practices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence longestConsecutiveSequence ;

    @BeforeEach
    void setUp() {
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }

    @Test
    void lengthOfTheLongestSequence() {
        int[] nums = new int[]{1,2,3,4,5,6};
        int result = longestConsecutiveSequence.lengthOfTheLongestSequence(nums);
        assertEquals(6, result);
    }

    @Test
    void lengthOfTheLongestSequenceNormalCase2() {
        int[] nums = new int[]{241,41,5,5,15,15,22,55,5,66,67,68,799};
        int result = longestConsecutiveSequence.lengthOfTheLongestSequence(nums);
        assertEquals(3, result);

    }
    @Test
    void abnormalCase() {
        int[] nums = {0,0,0,0,0,0,0,0};
        assertEquals(1, longestConsecutiveSequence.lengthOfTheLongestSequence(nums));
    }
}