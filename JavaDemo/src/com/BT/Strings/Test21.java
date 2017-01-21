package com.BT.Strings;

import java.util.Collection;
import java.util.List;

public class Test21 {

	public static void hello(Collection x) 
	{
		System.out.println("Collection"); 
	}

	public static void main(String[] args) 
	{
		Test21 t = new Testing();
		
		Testing t1 = new Testing(); 

		List x = null;

		t.hello(x); //Collection
		t1.hello(x); //List
	}

}

class Testing extends Test21 {

	public static void hello(List x) {

		System.out.println("List");

	}

}
                                
