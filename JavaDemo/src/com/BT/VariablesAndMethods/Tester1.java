package com.BT.VariablesAndMethods;
/*
 * The program will compile fine but won't run correctly, a NoSuchMethodError exception would be thrown
 */
public class Tester1 {

	public static void main(String args) 
	{
		System.out.println("JavaChamp");
	}

}
/*
 * The code will compile but will complain at run time that main() is not correctly defined.

You may think that the compiler should complain about the incorrect definition of method main(). But actually the compiler doesn't know whether 

if this is the method main or just an overloading of it. It is correctly written in syntax so no errors are produced from the compiler.

The Run time machine is the one going to complain, because to run a java program you need to define a main method with special syntax. 

And the JRM cannot find this method and throws a NoSuchMethodError

exception.

The correct signature of the main method to run a program is :

public static void main(String[] args)

public static void main(String... args)

*/