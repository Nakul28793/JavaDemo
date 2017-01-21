package com.BT.Generics;
/*
 *  	compilation error
 *  
 *  	In class Foo when overriding method compareTo() we must keep the access specifier "public" 
 *  	since the overriding rules say: the access specifier for an overriding method can allow more, but not less, access than the overridden method 
 */
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class Test8{

	public static void main(String[] args) 
	{
		List<Foo8> myFooList = new ArrayList<Foo8>();

		myFooList.add(new Foo8("C"));

		myFooList.add(new Foo8("A"));

		myFooList.add(new Foo8("D"));

		Collections.sort(myFooList); 

		System.out.print(myFooList.get(0).code);

	}

}

class Foo8 implements Comparable<Foo8> {

	String code;

	Foo8(String c) 
	{
		code = c;
	}

	int compareTo(Foo8 f) 
	//public int compareTo(Foo8 f)
	{
		return this.code.compareTo(f.code);
	}
}
