package main;

import org.junit.Assert;
import org.junit.Test;



public class BestTimetoBuyandSellStockTest {
    @Test
    public void BestTimetoBuyandSellStockTest1() {
        int[] prices = {7,1,5,3,6,4};
        int expect = 5;
        Assert.assertEquals(expect, BestTimetoBuyandSellStock.maxProfit(prices));
    }
    @Test
    public void BestTimetoBuyandSellStockTest2() {
        int[] prices = {7,6,4,3,1};
        int expect = 0;
        Assert.assertEquals(expect, BestTimetoBuyandSellStock.maxProfit(prices));
    }

    public static class FindMinimuminRotatedSortedArrayTest {

    }
}