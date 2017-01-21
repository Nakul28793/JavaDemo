package com.OverLoadingIssues;
/*
 * Var-args is always chosen last.You cannot widen then autobox (cannot widen from int to long then autobox to Long), 
 * BUT you can autobox then widen (autobox to Integer then widen to Number, Integer extends Number) 
 * therefore “Number x, Number y” is printed
 * 
 * Imp-Internally primitive int type is auto-boxed to Integer type and Integer type is auto-UpCasted to Number type as Integer wrapper class is a sub class of Number class. 
 */
public class Tester1 
{
	static void call(Long x, Long y) 
	{
		System.out.print("Long x, Long y");
	}

	static void call(int... x) 
	{
		System.out.print("int... x");
	}

	static void call(Number x, Number y) 
	{
		System.out.print("Number x, Number y");
	}

	public static void main(String[] args) 
	{
		int val = 3;

		call(val, val); //Number x, Number y
	}
}
