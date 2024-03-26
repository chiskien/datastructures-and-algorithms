package chiskien.datastructures_algorithms.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {

    FirstMissingPositive   firstMissingPositive;
    @BeforeEach
    void setUp() {
        firstMissingPositive = new FirstMissingPositive();

    }

    @Test
    void testcaseWithoutDuplicate() {
        int[] nums = {7,8,1,2,3,6};
        assertEquals(4, firstMissingPositive.firstMissingPositive(nums));
    }
    @Test
    void normalCase1() {
        int[] nums = {1,2,0};
        assertEquals(3, firstMissingPositive.firstMissingPositive(nums));
    }
    @Test
    void containNegative1() {
        int[] nums = {3,4,-1,1};
        assertEquals(2, firstMissingPositive.firstMissingPositive(nums));
    }
    @Test
    void abnormalCase1() {
        int[] nums = {1,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(2, firstMissingPositive.firstMissingPositive(nums));
    }
    @Test
    void abnormalCase2() {
        int[] nums = {2,1};
        assertEquals(3, firstMissingPositive.firstMissingPositive(nums));
    }
    @Test
    void abnormalCase3() {
        int[] nums = {1,2,6,3,5,4};
        assertEquals(7, firstMissingPositive.firstMissingPositive(nums));
    }
}