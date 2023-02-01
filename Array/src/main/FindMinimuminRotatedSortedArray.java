package main;

public class FindMinimuminRotatedSortedArray {
    public static int findMin(int[] nums) {
        int left =0;
        int right = nums.length-1;

        if(nums==null){
            return -1;
        }
        if(nums.length==1 || nums[0]<nums[right]){
            return nums[0];
        }

        while(right>left){
            int mid = left+(right-left)/2;

            if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[left]<nums[mid]){
                left=mid+1;
            }
            if(nums[mid]>nums[right]){
                right=mid-1;
            }
        }
        return Integer.MAX_VALUE;
    }
}
