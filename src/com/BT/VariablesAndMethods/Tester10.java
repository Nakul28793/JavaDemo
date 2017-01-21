package com.BT.VariablesAndMethods;
/*
 * NullPointerException is thrown
 */
public class Tester10 
{
	int x = 12;
	
	static Tester10 reset( Tester10 obj) 
	{
		obj = null;
		return obj;
	}
	
	public static void main(String[] args) 
	{
		Tester10 o10 = new Tester10();
		o10 = reset(o10);
		System.out.print(o10.x);
	}
}
