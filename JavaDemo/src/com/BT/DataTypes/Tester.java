package com.BT.DataTypes;
/*
 * 	floating-point numbers are by default of type double.
	99.9 is a double not a float
	to print “float” cast 99.9 to (float)
 */
public class Tester {

	static void test(float x) 
	{
		System.out.println("float");
	}

	static void test(double x) 
	{
		System.out.println("double"); 
	}

	public static void main(String[] args) 
	{
		test(99.9);  //double
		test((float) 99.9); //float
	}

}
