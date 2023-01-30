package main;

import org.junit.Assert;
import org.junit.Test;


public class ContainsDuplicateTest {
    @Test
    public void ContainsDuplicateTest1() {
        int[] nums = {1,2,3,1};
        boolean expect = true;
        Assert.assertEquals(expect, ContainsDuplicate.containsDuplicate(nums));
    }
    @Test
    public void ContainsDuplicateTest2() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean expect = true;
        Assert.assertEquals(expect, ContainsDuplicate.containsDuplicate(nums));
    }
    @Test
    public void ContainsDuplicateTest3() {
        int[] nums = {1,2,3,4};
        boolean expect = false;
        Assert.assertEquals(expect, ContainsDuplicate.containsDuplicate(nums));
    }
}