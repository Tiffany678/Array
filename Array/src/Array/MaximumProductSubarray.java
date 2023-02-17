package Array;

public class MaximumProductSubarray {
    /**
     * Given an integer array nums, find a subarray
     *  that has the largest product, and return the product.
     * The test cases are generated so that the answer will fit in a 32-bit integer.
     */
    /**
     * use brute force to loop through the array
     * create current subarray
     * create max subarray
     * then compare them and stores the value to the max subarray element;
     */
    public static int maxProduct(int[] nums) {
        int maxSub= Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++){
            int currentSub =1;
            for(int k=i; k<nums.length; k++){
                currentSub*=nums[k];
                maxSub= Math.max(maxSub, currentSub);
            }
        }
        return maxSub;

    }
}
