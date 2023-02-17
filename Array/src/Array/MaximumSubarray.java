package Array;

/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */

/**
 * using brute force nested loop:
 * compare the maxSub to the currentSub
 */
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSub =Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int currentSub =0;
            for(int k=i; k<nums.length; k++){
                currentSub+=nums[k];
                maxSub=Math.max(currentSub, maxSub);
            }
        }
        return maxSub;
    }
}

