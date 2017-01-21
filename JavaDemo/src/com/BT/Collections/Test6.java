package com.BT.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test6{
	
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		s.add("A"); // Line 1
		s.add(new Foo6()); // Line 2
		
		Set t = new TreeSet();
		t.add("A"); // Line 3
		t.add(new Foo6()); // Line 4
	}
}

class Foo6 {}
