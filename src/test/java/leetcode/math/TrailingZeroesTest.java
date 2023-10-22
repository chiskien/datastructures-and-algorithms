package leetcode.math;

import chiskien.datastructures_algorithms.leetcode.math.TrailingZeroes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrailingZeroesTest {
    TrailingZeroes trailingZeroes = new TrailingZeroes();
    @Test
    void trailingZeroes() {
            assertEquals(2, trailingZeroes.trailingZeroes(7));
    }
    @Test
    void trailingZeroes2() {
        assertEquals(2, trailingZeroes.trailingZeroes(15));
    }
}