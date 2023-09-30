package org.chiskien.datastructures_algorithms.leetcode.greedy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellStockOnceTest {
    BuyAndSellStockOnce buyAndSellStockOnce;

    @BeforeEach
    void setUp() {
        buyAndSellStockOnce = new BuyAndSellStockOnce();
    }

    @AfterEach
    void tearDown() {
        System.gc();
    }

    @Test
    void computeMaxProfit() {
        double[] nums = new double[]{240, 320, 330, 2000, 1200, 34343};
        assertEquals(200, buyAndSellStockOnce.computeMaxProfit(nums));
    }
}