package com.BT.Strings;
/*

== checks if two references are referring to the same object (physical memory location)

equals() checks if the two objects have the same value

a and b both refer to the same string literal, which was created in a special memory area called "String constant pool". 
Therefor a==b and b.equals(a) return true.

While c is a reference to an object created in the heap by the virtue of using the keyword "new". 
The object is created in the heap with a new memory location, therefor == fails to succeed when comparing a==c or b==c.

*/
public class Tester10 {

	public static void main(String[] args) 
	{
		String a = "javachamp";

		String b = "javachamp";

		String c = new String("javachamp");

		
		System.out.println(a==b); //true

		System.out.println(a==c); //false

		System.out.println(b.equals(c)); //true

		System.out.println(b.equals(a)); //true

	}
}
