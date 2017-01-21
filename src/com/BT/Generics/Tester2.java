package com.BT.Generics;
/*
 * 	2 will be printed but with warnings
 * 
 * 	This is giving a warning because the list2 is not a type safe declaration and so it can allow us to add any object in it.
 */
import java.util.ArrayList;

import java.util.List;

interface chewable2 
{

}

class Gum2 implements chewable2 
{

}

public class Tester2 {

	public static void main(String[] args) {

		List<Gum2> list1 = new ArrayList<Gum2>();

		list1.add(new Gum2());

		List list2 = list1;

		list2.add(new Integer(9));

		System.out.println(list2.size()); //2

	}

}
