package Array;

public class ProductExceptSelf {
    /**
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     */
    /**
     * let's say the nums={1,2,3,4}
     * the left side of the index element is {1,1,2,6}
     * the right side of the index element is {24,12,4,1}
     * the answer array is the production of the index of left side * the the index of the right side
     * {1*24, 1*12, 2*4, 6*1}
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = temp;
            temp = temp * nums[i];
        }

        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * temp;
            temp = temp * nums[i];
        }
        return result;
    }
}

