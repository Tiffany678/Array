package test.ArrayTest;
import Array.ProductExceptSelf;
import org.junit.Assert;
import org.junit.Test;


public class ProductExceptSelfTest {
    @Test
    public void ProductExceptSelfTestTest1() {
        int[] nums = {1,2,3,4};
        int[] expect = {24,12,8,6};
        Assert.assertArrayEquals(expect, ProductExceptSelf.productExceptSelf(nums));
    }
    @Test
    public void ProductExceptSelfTestTest2() {
        int[] nums = {-1,1,0,-3,3};
        int[] expect = {0,0,9,0,0};
        Assert.assertArrayEquals(expect, ProductExceptSelf.productExceptSelf(nums));
    }
}