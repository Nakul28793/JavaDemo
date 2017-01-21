package com.BT.Generics;
/*
 * 	4 	No, there is a compilation error at // Line 3 		
	5 	No, there is a compilation error at // Line 4
	
Let's examine first the return type of method ring():

The return type of ring method is Queue<E>. E is anything that extends B, which is in this case C. Which means only objects of declared type Queue<C> can be assigned the return of ring method()

So, at line1 and line2 assigning the result to q1 (Queue<C> declared type object) will pass

But, at line3 and line 4 assigning the result to q2 (PriorityQueue<C> declared type object) will fail (cannot convert from Queue<C> to PriorityQueue<C>)

Now let's examine the type of the argument of method ring():

The declaration type of the argument is List<E>, E is anything that extends B, which is in this case C.

The passing parameter to method ring can be declared (declaration type) as List or any of List's sub types (ArrayList, LinkedList,..)

You can send non-generic lists of these types or generic list of these types. But, in case of sending a generic list, then the generic type of the List must be C
 */
import java.util.*;

class B11 
{

}

class C11 extends B11 {

}

public class Test11 
{
	public static <E extends B11> Queue<E> ring(List<E> list) 
	{
		return null;
	}

	public static void main(String[] args) 
	{
		List<C11> list1 = new ArrayList<C11>();

		ArrayList<C11> list2 = new ArrayList<C11>();

		Queue<C11> q1;

		PriorityQueue<C11> q2;

		q1 = ring(list1); // line1

		q1 = ring(list2); // line2

		q2 = ring(list1); // line3

		q2 = ring(list2); // line4
	}
}