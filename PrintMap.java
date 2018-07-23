package com.testPackage;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {
	private static Map<String,Integer> testMap = new HashMap<String,Integer>(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		{
			put("a",1);
			put("b",2);
		}
	};
	static class InnerClass
	{
		public void someMethod(){
			System.out.println(testMap);
		}
		@Override
		public String toString()
		{
			return "Contents of the map are: " + "\n" + testMap;
		}
	}
	
	void displayInnerClass(){
		InnerClass ic = new InnerClass();
		ic.someMethod();
	}
	
	public static void main(String args[])
	{
		PrintMap.InnerClass innerClass = new PrintMap.InnerClass();
		System.out.println(innerClass);
		PrintMap pm = new PrintMap();
		pm.displayInnerClass();
		OverridetoString toStringObject = new OverridetoString();
		System.out.println(toStringObject);
	}
}
