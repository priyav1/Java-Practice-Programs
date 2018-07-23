package com.testPackage;

/**
 * 
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * Coud you solve it without converting the integer to a string?
 */
public class PalindromeWithoutConvertingToString {
	public static boolean checkPalindrome(int x)
	{
		if(x <= 0)
		{
			return false;
		}
		int original = x;
		int localNum = x;
		int reversedNum = 0;
		while(x >= 10)
		{
			localNum=x%10;
			x/=10;
			reversedNum=(reversedNum+localNum)*10;
		}
		reversedNum+=x;
		if(reversedNum == original){
			return true;
		}
		return false;
	}
	
	public static boolean moreEfficientPalindromeCheck(int x)
	{
		if(x < 0 || (x%10==0 && x!=0)) 
		{
			return false;
		}
		
		int reversedNum = 0;
		while(x > reversedNum)
		{
			reversedNum = (reversedNum*10)+(x%10);
			x/=10;
		}
		if(x == reversedNum || x == reversedNum/10){
			return true;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		System.out.println(moreEfficientPalindromeCheck(1221));
	}
}
