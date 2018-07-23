package com.testPackage;

import java.util.HashMap;
import java.util.Map;

public class OverridetoString {
	private static Map<Integer, String> mymap = new HashMap<Integer, String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(1, "one");
			put(2, "two");
		}
	};
	
	@Override
	public String toString()
	{
		return "Contents of the map are: " + "\n" + mymap;
	}
}
