package Array;

public class BestTimetoBuyandSellStock {
    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     */
    /**
     * find the lowest price to buy in, Math.min(prices[i], buyAtLow)
     * find the highest price to sale, Math.max(prices[i]-buyAtLow, result)
     */
    public static int maxProfit(int[] prices) {
       int buyAtLowest = Integer.MAX_VALUE;
       int saleAtHighest= Integer.MIN_VALUE;

       for(int i=0; i<prices.length; i++){
           buyAtLowest= Math.min(buyAtLowest, prices[i]);
           saleAtHighest= Math.max(saleAtHighest, prices[i]-buyAtLowest);
       }
       return saleAtHighest;
    }
}
