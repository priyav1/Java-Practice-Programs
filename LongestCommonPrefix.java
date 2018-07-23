package com.testPackage;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *If there is no common prefix, return an empty string "".
 */

public class LongestCommonPrefix {
	public  static String longestCommonPrefix(String[] strs)
	{
		if(strs.length == 0){
			return "";
		}
		String shortestString = strs[0];
		for(int i=1;i<strs.length;i++)
		{
			if(shortestString.length() > strs[i].length())
			{
				shortestString = strs[i];
			}
		}
		for(String s:strs)
		{
			if(!s.equals(shortestString))
			{
				for(int i=0;i<shortestString.length();i++)
				{
					if(s.charAt(i)!=shortestString.charAt(i))
					{
						shortestString = shortestString.substring(0,i);
					}
				}
			}
		}
		return shortestString;
	}
	
	public static void main(String args[])
	{
		String[] strs = {"cat","dog"};
		System.out.println(longestCommonPrefix(strs));
	}
}

