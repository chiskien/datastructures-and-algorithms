package leetcode.recursion;

import chiskien.datastructures_algorithms.leetcode.recursion.GreatestCommonDivisor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();

    @Test
    void findGreatestCommonDivisor() {
        assertEquals(12, gcd.findGreatestCommonDivisor(156, 36));
    }
}