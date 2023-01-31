package main;

import main.ProductExceptSelf;
import org.junit.Assert;
import org.junit.Test;


public class MaximumSubarrayTest {
    @Test
    public void maximumSubarrayTest1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expect = 6;
        Assert.assertEquals(expect, MaximumSubarray.maxSubArray(nums));
    }
    @Test
    public void maximumSubarrayTest2() {
        int[] nums = {1};
        int expect = 1;
        Assert.assertEquals(expect, MaximumSubarray.maxSubArray(nums));
    }
    @Test
    public void maximumSubarrayTest3() {
        int[] nums = {5,4,-1,7,8};
        int expect = 23;
        Assert.assertEquals(expect, MaximumSubarray.maxSubArray(nums));
    }
}