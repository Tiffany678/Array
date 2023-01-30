package main;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     */
    /**
     * Create HashSet, check if the hSet.contains(nums[i])
     * if yes, return true; else return false;
     */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();

        for(int i=0; i<nums.length;i++){
            if(hSet.contains(nums[i])){
                return true;
            }
            hSet.add(nums[i]);
        }
        return false;
    }
}
