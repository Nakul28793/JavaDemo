package com.OverLoadingIssues;
/*
 * Var-args is always chosen last, but since you cannot widen then 
 * autobox (cannot widen from int to long then autobox to Long), int... x is printed 
 */
public class Tester 
{
	static void call(Long x, Long y) 
	{
		System.out.print("Long x, Long y");
	}

	static void call(int... x) 
	{
		System.out.print("int... x");
	}

	public static void main(String[] args) 
	{
		int val = 3;
		
		call(val, val); //int... x

	}
}