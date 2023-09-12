package org.chiskien.datastructures.leetcode.greedy;

public class BuyAndSellStockOnce {



    public static double computeMaxProfit(double[] prices) {
        double maxProfit = 0.0;
        double minPrice = Double.MAX_VALUE;

        for (Double price : prices) {
            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }
}
