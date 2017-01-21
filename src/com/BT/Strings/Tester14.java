package com.BT.Strings;
/*
 * Compilation error
 * 
 * 	Compilation error because of StringBuffer sb = "";

	StringBuffer cannot be instantiated and initialized this way
	
	
	String ,StringBuffer and StringBuilder are siblings i.e string implements Serializable,charsequence and Comparable interfaces.
	and StringBuilder and StringBuffer implements Serializable,Charsequence and Appendable interfaces
 */
public class Tester14 {
	
	public static void main(String[] args) 
	{
		String s = "";

		Integer x = 5;

		StringBuffer sb = "";
		//StringBuffer sb = new StringBuffer("");

		if (x < 0)

			s.concat("javachamp");

		else

			sb.append("javachamp");

		    System.out.print(s + sb);
	}
}
