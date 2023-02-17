package test.DynamicProgrammingTest;

import DynamicProgramming.ClimbingStairs;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {
    ClimbingStairs climbingStairs = new ClimbingStairs();
    @Test
    public void climbStairs() {
        int input =2;
        int expect =2;
        Assert.assertEquals(expect, climbingStairs.climbStairs(input));
    }
}