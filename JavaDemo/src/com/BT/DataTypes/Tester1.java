package com.BT.DataTypes;
/*
 * 	floating-point numbers are by default of type double.
	99.9 is a double not a float
	The compiler will complain because it cannot find a method named test() that can accept a double.
 */
public class Tester1 {
	
	static void test(float x) 
	{
		System.out.print("float");
	}

	public static void main(String[] args) 
	{
		test(99.9); // Error : The method test(float) in the type Tester1 is not applicable for the arguments (double)
	}
}
