package com.BT.VariablesAndMethods;

public class Tester9 
{
	int x = 12;
	
	static void reset(Tester9 obj) 
	{
		obj = null;
	}
	public static void main(String[] args) 
	{
		Tester9 o9 = new Tester9();
		reset(o9);
		System.out.print(o9.x); //12
	}
}
/*
 * The variable is passed in Java by value not by reference. So it is not o9 that is assigned to null, 
rather the local variable obj in method reset, which was first assigned to the same value of o9 then to null.

In simple words:

calling method reset(o1) will make "obj", the local variable of method reset, refer to the same object "o9" refers to.

Inside method reset, "obj" will then be set to null (refers to nothing)

At this point only "obj" is affected not "o9", who still refers to the same object before calling reset(o9)
 */
