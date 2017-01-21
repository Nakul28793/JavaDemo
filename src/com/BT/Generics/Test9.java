package com.BT.Generics;

import java.util.ArrayList;
/*
 * compilation error
 * 
 * 	f = list.get(1) causes a compilation error, it must be casted to (Foo).

	list is a non-generic collection, which means any type of object is allowed to be inserted in it. 
	But because it is a non-generic collection, it means when fetching its elements, 
	the return type of the fetched element will be Object not the actual type of the element. Therefore, we need to cast the element to its actual type.
 */
import java.util.List;

public class Test9{

	public static void main(String[] args) 
	{

		List list = new ArrayList();

		list.add("Hello");

		Foo f = new Foo();

		list.add(f); 

		f = list.get(1);
		//f = (Foo)list.get(1); //Hello-Foo

		System.out.print(list.get(0) + "-" + f);

	}

}

class Foo 
{
	public String toString() 
	{
		return "Foo";
	}
}
                                
