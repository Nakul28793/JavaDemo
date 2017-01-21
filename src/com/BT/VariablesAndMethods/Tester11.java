package com.BT.VariablesAndMethods;
/*
 * Final variables cannot be reassigned
 */
public class Tester11 {
	
	final short s = 12; // Line 3
	
	static void swap( Tester11 obj) 
	{
		obj.s = 11; // Line 6 //Compilation error at line 6
	} 
	
	public static void main(String[] args) 
	{
		final Tester11 obj11 = new Tester11();
		swap(obj11);
		System.out.print(obj11.s); // Line 12
	}
}
