package test.ArrayTest;

import Array.FindMinimuminRotatedSortedArray;
import org.junit.Assert;
import org.junit.Test;

public class FindMinimuminRotatedSortedArrayTest {
    @Test
    public void findMinimuminRotatedSortedArrayTest1() {
        int[] nums = {3,4,5,1,2};
        int expect = 1;
        Assert.assertEquals(expect, FindMinimuminRotatedSortedArray.findMin(nums));
    }
    @Test
    public void findMinimuminRotatedSortedArrayTest2() {
        int[] nums = {4,5,6,7,0,1,2};
        int expect = 0;
        Assert.assertEquals(expect, FindMinimuminRotatedSortedArray.findMin(nums));
    }
    @Test
    public void findMinimuminRotatedSortedArrayTest3() {
        int[] nums = {11,13,15,17};
        int expect = 11;
        Assert.assertEquals(expect, FindMinimuminRotatedSortedArray.findMin(nums));
    }
}