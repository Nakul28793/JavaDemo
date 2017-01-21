package com.BT.Collections;

public class Test5{
	
	public static void main(String[] args) 
	{
		Foo5 foo1 = new Foo5(1);
		Foo5 foo2 = new Foo5(2);
		System.out.print(foo1.equals(foo2)); //false
	}
}
	
class Foo5{
	Integer code;
	Foo5(Integer c) {
	code = c;
	}
	public boolean equals(Foo5 f) {
	return false;
	}
	public boolean equals(Object f) {
	return true;
	}
}
