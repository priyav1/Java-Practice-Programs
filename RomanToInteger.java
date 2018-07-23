package com.testPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RomanToInteger {
	public static int romanToInteger(String s)
	{
		int result = 0;
		Map<Character, Integer> mapValues = new HashMap<>();
		mapValues.put('I', 1);
		mapValues.put('V', 5);
		mapValues.put('X', 10);
		mapValues.put('L', 50);
		mapValues.put('C', 100);
		mapValues.put('D', 500);
		mapValues.put('M', 1000);
		Set<Character> checkBeforeValues = new HashSet<>();
		checkBeforeValues.add('I');
		checkBeforeValues.add('X');
		checkBeforeValues.add('C');
		int i = 0;
		while(i<s.length())
		{
			if(checkBeforeValues.contains(s.charAt(i)) && i+1 < s.length() && mapValues.get(s.charAt(i)) < mapValues.get(s.charAt(i+1))){
				result += mapValues.get(s.charAt(i+1)) - mapValues.get(s.charAt(i));
				i++;
			}
			else{
				result += mapValues.get(s.charAt(i));
			}
			i++;
		}
		return result;
	}
	
	public static void main(String args[])
	{
		System.out.println(romanToInteger("DCXXI"));
		System.out.println(romanToInteger("IX"));
		System.out.println(romanToInteger("XLVIII"));
		System.out.println(romanToInteger("III"));
		System.out.println(romanToInteger("IV"));
		System.out.println(romanToInteger("LVIII"));
		System.out.println(romanToInteger("MCMXCIV"));
	}
}
