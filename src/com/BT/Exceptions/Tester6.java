package com.BT.Exceptions;
/*
 * System.exit(0) will cause the program to exit and finally block will not be executed 
 * system.exit() will stop your JVM (java vartual machine) so no further execution will continue. 
 */
public class Tester6 {

	public static void main(String[] args) 
	{
		System.out.println("1"); //1
		try 
		{
			System.out.println("2"); //2
			System.exit(0);
		} 
		finally 
		{
			System.out.println("3");
		}
	}
}