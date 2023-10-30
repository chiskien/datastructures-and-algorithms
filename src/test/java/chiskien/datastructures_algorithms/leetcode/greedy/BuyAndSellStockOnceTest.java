package chiskien.datastructures_algorithms.leetcode.greedy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        double[] nums = new double[]{1200,200,300,400,600,500,1200,200};
        assertEquals(1000, buyAndSellStockOnce.computeMaxProfit(nums));
    }
}