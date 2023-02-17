package test.ArrayTest;

import Array.ContainerWithMostWater;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest extends TestCase {
    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
@Test
    public void testMaxArea() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int expect = 49;
        Assert.assertEquals(expect, containerWithMostWater.maxArea(height));

    }
    @Test
    public void testMaxArea1() {
        int[] height = {1,1};
        int expect = 1;
        Assert.assertEquals(expect, containerWithMostWater.maxArea(height));

    }

}