package com.BT.Strings;

public class Tester4 {
	
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("javachamp");

		String s = new String("javachamp");

		boolean stmt1 = s.equals(sb) ;
		System.out.println(stmt1); //false
		
		boolean stmt2 = sb.equals(s) ;
		System.out.println(stmt2); //false
		
		boolean stmt3 = sb.toString() == s ;
		System.out.println(stmt3); //false
		
		boolean stmt4 = sb.toString().equals(s) ;
		System.out.println(stmt4); //true
		
		boolean stmt5 = s.equals(sb.toString()) ;
		System.out.println(stmt5); //true
		

	}
}
