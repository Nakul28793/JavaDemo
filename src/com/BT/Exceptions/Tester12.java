package com.BT.Exceptions;
/*
 * No exception is thrown.

Splitting "javachamp 2009" string with either '\\s' or ' ' regex expression gives 2 strings: "javachamp" and "'2009". Parsing string "2009" gives integer 2009.

The code will print 2009 followed by finally.

finally's body will be executed no matter an exception is thrown or not
 */
public class Tester12 {

	public static void main(String[] args) 
	{
		String stmt = "javachamp 2009";
		String[] arr = stmt.split(" ");
		try 
		{
			int x = Integer.parseInt(arr[1]);
			System.out.println(x);
		} 
		finally 
		{
			System.out.println("finally");
		}
	}
}
//2009
//finally