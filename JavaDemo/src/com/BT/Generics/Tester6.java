package com.BT.Generics;
/*	The return type of printSize() does not match with the types of list2 and list3 
 * 	6 	Line 21 		
	7 	Line 22
	
	the problem in line 21 is the left hand side "list2", the method printSize() returns a list of type "List<? extends Chewable>" , 
	while "list2" is of type "List<Chewable>" ,which causes a mismatch.

	The same problem in line 22, here we are trying to squeeze a "List<? extends Chewable>" in a "List<Meat>"
 */
import java.util.ArrayList;

import java.util.List;

interface Chewable6 
{

}

class Meat6 implements Chewable6 
{
	
}

public class Tester6 {

	public static List<? extends Chewable6> printSize(List<? extends Chewable6> list) { // Line 10

		System.out.println(list.size());

		return list;
	}

	public static void main(String[] args) 
	{
		List<? extends Chewable6> list1 = new ArrayList<Meat6>(); // Line 16

		List<Chewable6> list2 = new ArrayList<Chewable6>(); // Line 17

		List<Meat6> list3 = new ArrayList<Meat6>(); // Line 18

		list1 = printSize(list1); // Line 20

		list2 = printSize(list2); // Line 21

		list3 = printSize(list3); // Line 22

	}
}
