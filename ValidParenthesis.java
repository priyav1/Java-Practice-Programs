package com.testPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */
public class ValidParenthesis {
	public static boolean isValid(String s)
	{
		Stack<Character> store = new Stack<>();
		Map<Character,Character> mapValues = new HashMap<>();
		mapValues.put(')', '(');
		mapValues.put('}', '{');
		mapValues.put(']', '[');
		Character check;
		for(int i=0;i<s.length();i++)
		{
			if(mapValues.containsKey(s.charAt(i))){
				if(store.isEmpty()){
					return false;
				}
				check = store.pop();
				if(check!=mapValues.get(s.charAt(i))){
					return false;
				}
			}
			switch (s.charAt(i))
			{
			case '{':
				store.push(s.charAt(i));
				break;
			case '(':
				store.push(s.charAt(i));
				break;
			case '[':
				store.push(s.charAt(i));
				break;
			}
			
		}
		return store.isEmpty();
	}
	
	public static void main(String args[])
	{
		System.out.println(isValid("((("));
	}
}
