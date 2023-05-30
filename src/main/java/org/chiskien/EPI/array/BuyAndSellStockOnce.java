package org.chiskien.EPI.array;

public class BuyAndSellStockOnce {

    public static void main(String[] args) {
        double[] stocks = new double[]{310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
        System.out.println(computeMaxProfit(stocks));
    }

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
