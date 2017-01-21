package com.BT.VariablesAndMethods;
/*
 * The local variable y may not have been initialized
 * Before using local variables we must initialize with default values.
 * local variables should be initialized with default values. If it is not initialized whenever we are using that their itself compilation will failed 
 */
public class Tester {
	
	public static void main(String[] args) 
	{
		int z;

		System.out.println("Java Champ");
		//output : code compiles fine and print Java Champ
		
		
		int x = 5, y;
		//int y=0;
		while (++x < 7) 
		{
			y = 2;
		}
		System.out.println(x + y);
		
		//if y=0 then output 7
	}

}
