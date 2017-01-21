package com.BT.VariablesAndMethods;
/*
 * scope of private method is within a class. you are not outside the class.
 */
public class SomeClass 
{
	static int i ;
	
	private static int increment(int i) 
	{
		return ++i;
	}
	public SomeClass() 
	{
		i = 1;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(i); //0
		System.out.println( increment(i)); //1
		System.out.println(i); //0
	}
}	