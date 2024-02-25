package chiskien.datastructures_algorithms.array;

import chiskien.datastructures_algorithms.heap.MaximumProductOfTwoElements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductOfTwoElementsTest {
    MaximumProductOfTwoElements maximumProductOfTwoElements;

    @BeforeEach
    void setUp() {
        maximumProductOfTwoElements = new MaximumProductOfTwoElements();
    }

    @Test
    void normalCase1() {
        int[] nums = {2, 4, 21, 21};
        assertEquals(400, maximumProductOfTwoElements.maxProduct(nums));
    }
}