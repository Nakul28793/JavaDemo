package com.BT.Strings;
/*
 * compilation error
 * 
 * Error reference to method is ambiguous, both method method(StringBuffer) in de.qchamp.ws.Test and method method(String) 
 */
public class Test17 {
	
	public void method(StringBuffer sb) 
	{
		System.out.println("StringBuffer method");
	}

	public void method(String s) 
	{
		System.out.println("String method");
	}

	public static void main(String[] args)
	{
		Test17 test = new Test17();

		test.method(null);
	}
}
