package com.testPackage;

public class RemoveDuplicateElementsFromSortedArray {
	public static int removeDuplicate(int[] nums)
	{
		int length=0;
		if(nums.length<=1){
			return nums.length;
		}
		for(int i=0,j=1;j<nums.length;i++,j++)
		{
			if(nums[i]!=nums[j]){
				length++;
			}
		}
		return ++length;
	}
	
	public static int inplaceRemoval(int[] nums)
	{
		if(nums.length<=1){
			return nums.length;
		}
		int i=0;
		for(int j=1;j<nums.length;j++)
		{
			if(nums[i]!=nums[j])
			{
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}
	
	public static void main(String args[])
	{
		System.out.println(removeDuplicate(new int[]{}));
	}
}
