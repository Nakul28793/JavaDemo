package com.BT.VariablesAndMethods;
/*
 * Accessing variable x in in the else block is out of scope 
 */
public class Tester8 
{
	public static void main(String[] args) 
	{	//int x = 5;
		if(true)
		{
			int x = 5;
			System.out.print(x);
		} 
		else 
		{
			++x;
			System.out.print(x);
		}
	}
}	