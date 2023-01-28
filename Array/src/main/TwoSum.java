package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */

    /**
     * It should be use HashMap<Integer, Integer>, key stores the element of nums array, and the value stores the index of that element in the nums array.
     * then use map.containsKey() to check whether the value (target-nums[i]) contains in the HashMap
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length==0 || nums==null){
            return result;
        }

        HashMap<Integer, Integer> maps = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int temp = target-nums[i];
            if(maps.containsKey(temp)){
                result[1] = i;
                result[0] = maps.get(temp);
            }
            maps.put(nums[i], i);

        }
        return result;
    }
}


