package test;

import org.junit.Assert;
import org.junit.Test;

import main.TwoSum;

public class  TwoSumTest {
    @Test
    public void twoSum() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expect ={0,1};
        Assert.assertArrayEquals(expect, TwoSum.twoSum(nums, target));
    }
    @Test
    public void twoSum1() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expect ={1,2};
        Assert.assertArrayEquals(expect, TwoSum.twoSum(nums, target));
    }
    @Test
    public void twoSum2() {
        int[] nums = {3,3};
        int target = 6;
        int[] expect ={0,1};
        Assert.assertArrayEquals(expect, TwoSum.twoSum(nums, target));
    }
}