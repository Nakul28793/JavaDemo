package com.BT.GarbageCollection;
/*
 * arr = null; x = new Integer(450);
 */
public class Tester1 {

	public static void main(String[] args) 
	{
		Integer[] arr = new Integer[3];

		arr[0] = new Integer("3"); // Line 5

		Integer x = arr[0];

		// insert code here
	}
}
/*
There are two references to the object created at line 5, a[0] and x.

Nulling only "arr" or "arr[0]" or "x", or making them point to other objects, is not enough.

We need to detach all the references to this object.

So, to make the object eligible for garbage collection, we can either :

1) set "arr" to null or to other object and set "x" to null or other object

2) or set "arr[0]" to null or other object and set "x" to null to other object
*/
