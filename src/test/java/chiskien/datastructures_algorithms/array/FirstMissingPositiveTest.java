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
}