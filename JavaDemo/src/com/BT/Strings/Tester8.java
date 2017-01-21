package com.BT.Strings;
/*
 * "A" will be printed followed be a NullPointerException thrown
 */
public class Tester8 {
	
	public static void main(String[] args) 
	{

		String s1 = null;

		String s2 = null;
		
		String s3 = "";

		String s4 = "";
		
		if (s1 == s2)

			System.out.println("A");

		if (s1.equals(s2))

			System.out.println("B");
		
		
		if (s3 == s4)

			System.out.println("C"); //C

		if (s3.equals(s4))

			System.out.println("D"); //D
	}
}
/*
 * 	A
	Exception in thread "main" java.lang.NullPointerException
		at com.BT.Strings.Tester8.main(Tester8.java:16)
 */
