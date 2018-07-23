package com.testPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {
	public static void main(String args[])
	{
		String regex = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}|[0-9]{2} [0-9]{10} [0-9]{2}|NCF Reference #   [0-9]{14}|[0-9]{2} Q[0-9]{10}|UPC[0-9]{30}|[A-Z]{3,9} [0-9]{2}, [0-9]{4}";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		String quote = "12 Q1234567891  ";
		String quote1 = "21 Q1232567891";
		Matcher match = pattern.matcher(quote);
		Matcher match1 = pattern.matcher(quote1);
		quote = match.replaceAll(" ");
		quote1 = match1.replaceAll(" ");
		if(!quote.equals(quote1)){
			System.out.println("not a match");
		}
		System.out.println("done");
	}

}
