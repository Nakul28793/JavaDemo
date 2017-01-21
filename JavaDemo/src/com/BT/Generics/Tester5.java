package com.BT.Generics;
/*
 * 3 	Line 17
 * You cannot add to a collection declared using wild card '?' 
 * 
 * 	the rule is only true for (? extends XXX) but for (? super XXX) you can add something on it.
	In (? extends XXX) there are chance you add an object class that not extends from XXX, 
	so the compiler dont want to take a risk by allowing you to add something on it.

	But with (? super XXX) you can add something on it because super of XXX include class Object, 
	and it is safe for addition because all object must be extending class Object.
 */
import java.util.ArrayList;

import java.util.List;

interface Chewable5 
{

}

class Meat5 implements Chewable5 
{

}

public class Tester5 {

	public static void main(String[] args) 
	{
		List<? extends Chewable5> list1 = new ArrayList<Meat5>(); // Line 11
		//List<? super Chewable5> list1 = new ArrayList<Chewable5>();
		
		List<Chewable5> list2           = new ArrayList<Chewable5>(); // Line 13
		Meat5 meat = new Meat5();
		list1.add(meat); // Line 17
		list2.add(meat); // Line 19
	}
}
