package com.BT.VariablesAndMethods;
/*
 * There are two different variables with the same name x, one is declared in the static block and 
 * the other is the static variable x which is first initialized with 0 . 
 * x used in main() is the the static variable x. 
 */
/*
 * Pay attention to the fact that what declared inside the static block can only be used inside that block. 
 * So the "x" used in the main() is that variable "int x;" not that one in the static block
 */
public class Tester2 {
	static 
	{
		int x = 3;
	}
	
	static int x;
	 	   //int x;	
	public static void main(String[] args) {
		x--; // line 7 //if we change static to non-static then we get error like Cannot make a static reference to the non-static field x
		System.out.println(x); //-1
 }
}
