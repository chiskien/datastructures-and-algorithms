package chiskien.datastructures_algorithms.leetcode.greedy;

public class BuyAndSellStockOnce {


    public double computeMaxProfit(double[] prices) {
        double maxProfit = 0.0, minPrice = Double.MAX_VALUE;
        for (Double price : prices) {
            double difference = price - minPrice;
            maxProfit = Math.max(maxProfit, difference);
            minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }
}
