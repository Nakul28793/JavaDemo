package com.BT.Arrays;

public class A1 {
	public static void main(String[] args) 
	{
		int[] a = new int[0];
		
		System.out.println(a.length); //0
		System.out.println(a[0]);
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
				at com.BT.Arrays.A1.main(A1.java:9)
		 */
		
		
		 int[] arrayOfInts;      //Declaring an array of int
	        
	     arrayOfInts = new int[10];   //Instantiating an array of int using new operator
	     
	     arrayOfInts[2] = 12;         //Initializing 3rd element
	     
	     arrayOfInts[5] = 56;         //Initializing 6th element
		 
	     
	     //Declaring, instantiating and Initializing an array in one statement
	     //Note: You should not mention array size here. If you mention array size, you will get compile time error.
	     double[] arrayOfDoubles = new double[] {12.56, 45.87, 14.85};
	     	//or
	     double[] arrayOfDoubles1 = {12.56, 45.87, 14.85};
 
	     char[] arrayOfChars;     //Declaring an array of characters
 
	     boolean arrayOfBooleans[];   //Declaring an array of booleans
        
        
 
        
	}
}
