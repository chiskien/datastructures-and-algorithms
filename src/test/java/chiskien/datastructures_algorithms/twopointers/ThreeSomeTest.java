package chiskien.datastructures_algorithms.twopointers;

import chiskien.datastructures_algorithms.twopointers.ThreeSome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThreeSomeTest {
    ThreeSome threeSome;

    @BeforeEach
    void setUp() {
        threeSome = new ThreeSome();
    }

    @Test
    void threeSome() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        threeSome.threeSome(nums);
    }
}