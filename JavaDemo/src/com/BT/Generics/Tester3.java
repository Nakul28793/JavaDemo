package com.BT.Generics;

import java.util.ArrayList;

import java.util.List;

interface chewable3 
{
	
}

class Gum3 implements chewable3
{
	
}

class Meat3 implements chewable3 
{
	
}

public class Tester3 {

	public static void main(String[] args) {

		List list1 = new ArrayList<chewable3>();// line 1
		//List<chewable> list1 = new ArrayList<chewable3>();// line 1 //error

		list1.add(new Gum3());// line 2

		list1.add(new Meat3());// line 3

		list1.add(new Integer(9));// line 4

		System.out.println(list1.size());// line 5   //3

	}

}
