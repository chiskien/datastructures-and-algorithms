package org.chiskien.datastructures.leetcode.greedy;

import java.util.ArrayList;
import java.util.List;

public class BuyAndSellStockTwice {


    //Calculate best profit from 0 -> length - 1
    //Calculate best profit from last to first

    public static int maxTotalProfit(int[] prices) {
        int maxTotalProfit = 0;
        List<Integer> firstBuySellProfits = new ArrayList<>();
        int minPriceSoFar = Integer.MAX_VALUE;

        // Forward phase. For each day, we record maximum profit if we 
        // sell on that day.
        for (int price : prices) {
            minPriceSoFar = Math.min(minPriceSoFar, price);
            maxTotalProfit = Math.max(maxTotalProfit, price - minPriceSoFar);
            firstBuySellProfits.add(maxTotalProfit);
        }

        // Backward phase. For each day, find the maximum profit if we make
        // the second buy on that day.
        int maxPriceSoFar = Integer.MIN_VALUE;
        for (int i = prices.length - 1; i > 0; i--) {
            maxPriceSoFar = Math.max(maxPriceSoFar, prices[i]);
            maxTotalProfit = Math.max(maxTotalProfit, maxPriceSoFar - prices[i]
                    + firstBuySellProfits.get(i - 1));
        }
        return maxTotalProfit;

    }
}
