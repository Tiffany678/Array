package test.ArrayTest;

import Array.MaximumProductSubarray;
import org.junit.Assert;
import org.junit.Test;

public class MaximumProductSubarrayTest {
    @Test
    public void maximumSubarrayTest1() {
        int[] nums = {2,3,-2,4};
        int expect = 6;
        Assert.assertEquals(expect, MaximumProductSubarray.maxProduct(nums));
    }
    @Test
    public void maximumSubarrayTest2() {
        int[] nums = {-2,0,-1};
        int expect = 0;
        Assert.assertEquals(expect, MaximumProductSubarray.maxProduct(nums));
    }


}