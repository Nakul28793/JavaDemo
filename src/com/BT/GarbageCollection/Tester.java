package com.BT.GarbageCollection;
/*
 * 0
 */
public class Tester {

	public static void main(String[] args) 
	{
		Integer x = new Integer(3000); 

	    Integer y = new Integer(4000); 

	    Integer z = new Integer(5000); 

	    Object a = x; 

	    x = y;

	    y = z;

	    z = null; //line 7
	}
}
/*
 * All the three Integer objects created will still have references to them after line 7 is executed.

After line 7 :

"a" is a reference to the first Integer(3000)

"x" is a reference to the second Integer(4000)

"y" is a reference to the third Integer(5000)

"z" is a reference to nothing
 */
