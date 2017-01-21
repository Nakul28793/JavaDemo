package com.BT.Exceptions;
/*
 * 
 * Compilation error at line 8, unhandled exception
 */
interface Foldable 
{
	public void fold() throws Exception ;
	//public void fold() throws NullPointerException ;
}

class Paper implements Foldable 
{
	public void fold() { // line 6
		System.out.print("Fold");
	}
}

public class Tester5 
{
	public static void main(String args []) 
	{
		Foldable obj1 = new Paper();
		obj1.fold(); // line 8
		Paper obj2 = new Paper(); // line 10
		obj2.fold();
	}
}