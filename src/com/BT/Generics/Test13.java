package com.BT.Generics;
/*
 * Given the following incomplete program, based on the given put statements in map, what is considered a correct declaration and instantiation for map ?
 * 
 * Map<List<Integer>, Number> map = new HashMap<List<Integer>, Number>();
 * 
 * 
As we can see map accepts as key values ArrayList<Integer> and LinkedList<Integer>, therefore the correct data type for map keys is List<Integer>. 
(we exclude answer number 5)

Now moving to the second part of the map, the values, we see that map accepts values of type Integer and Long, 
therefore the type should cover these two types. Answers number 2,4,6 restrict the type to Integer, therefore they are excluded.

Answer 1, uses ? in declaration type, and when ever ? is used you cannot add to the collection (only adding null is allowed).

Which leaves us with answer 3 as a correct answer.
 */
import java.util.*;

public class Test13 {

	public static void main(String[] args) 
	{
		// insert code here
		

		map.put(new ArrayList<Integer>(), 1);

		map.put(new ArrayList<Integer>(), 12);

		map.put(new LinkedList<Integer>(), new Integer(1));

		map.put(new LinkedList<Integer>(), new Long(1));

	}

}
