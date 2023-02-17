package test.DynamicProgrammingTest;

import DynamicProgramming.CoinChange;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {
    CoinChange coinChange = new CoinChange();

    @Test
    public void coinChange() {
        int[] input ={1,2,5};
        int expect = 3;
        Assert.assertEquals(expect, coinChange.coinChange(input, 11));
    }
    @Test
    public void coinChange1() {
        int[] input ={2};
        int expect = -1;
        Assert.assertEquals(expect, coinChange.coinChange(input, 3));
    }
    @Test
    public void coinChange2() {
        int[] input ={1,4,7,9};
        int expect = 2;
            Assert.assertEquals(expect, coinChange.coinChange(input, 18));
    }

    @Test
    public void coinsSort() {
        int[] input ={1,2,5};
        int[] expect ={5,2,1};
        Assert.assertArrayEquals(expect, coinChange.coinsSort(input));
    }
    @Test
    public void coinsSort1() {
        int[] input ={1,2,5,-2,6,7,0};
        int[] expect ={7,6,5,2,1,0,-2};
        Assert.assertArrayEquals(expect, coinChange.coinsSort(input));
    }
    @Test
    public void coinsSort2() {
        int[] input ={1,4,7,9};
        int[] expect ={9,7,4,1};
        Assert.assertArrayEquals(expect, coinChange.coinsSort(input));
    }
}