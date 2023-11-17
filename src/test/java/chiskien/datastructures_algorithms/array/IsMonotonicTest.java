package chiskien.datastructures_algorithms.array;

import chiskien.datastructures_algorithms.array.IsMonotonic;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsMonotonicTest {
    IsMonotonic isMonotonic;

    @BeforeEach
    void setUp() {
        isMonotonic = new IsMonotonic();
    }

    @AfterEach
    void tearDown() {
        System.gc();
    }

    @Test
    void normalCase() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertTrue(isMonotonic.isMonotonic(nums));
    }

    @Test
    void normalCase2() {
        int[] nums = new int[]{9, 8, 7, 6, 5, 5, 4, 4, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 1};
        assertTrue(isMonotonic.isMonotonic(nums));
    }

    @Test
    void normalCase3() {
        int[] nums = new int[]{1, 3, 2};
        assertFalse(isMonotonic.isMonotonic(nums));
    }

    @Test
    void emptyArray() {
        int[] nums = new int[]{};
        assertTrue(isMonotonic.isMonotonic(nums));
    }

    @Test
    void oneElement() {
        int[] nums = new int[]{1};
        assertTrue(isMonotonic.isMonotonic(nums));
    }

    @Test
    void twoElements() {
        int[] nums = new int[]{2, 3};
        assertTrue(isMonotonic.isMonotonic(nums));
    }
}