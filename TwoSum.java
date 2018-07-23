package com.testPackage;

import java.util.HashMap;
import java.util.Map;

/**
 *Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *Given nums = [2, 7, 11, 15], target = 9,
 *Because nums[0] + nums[1] = 2 + 7 = 9,
 *return [0, 1].
 */
public class TwoSum {
	 public static int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> localMap = new HashMap<>();
	        int[] result = {0,0};
	        for(int i=0; i<nums.length; i++)
	        {
	            localMap.put(nums[i],i);
	        }
	        
	        for(int i=0;i<nums.length; i++)
	        {
	            if(localMap.containsKey(target-nums[i]) && localMap.get(target-nums[i]) != i)
	            {
	            	System.out.println("i is " + nums[i]);
	                result[0] = i;
	                result[1] = localMap.get(target-nums[i]);
	                return result;
	            }
	        }
	        
	        return result;
	    }
	 
	 public static void main(String args[])
	 {
		 int[] nums = {3,3};
		 int target = 6;
		 int[] result = twoSum(nums, target);
		 System.out.println(result[0]+ " "+result[1]);
	 }
}
