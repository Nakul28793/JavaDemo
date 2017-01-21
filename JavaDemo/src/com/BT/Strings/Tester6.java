package com.BT.Strings;

public class Tester6 {
	
	public static void main(String args []) 
	{
			
			String stmt1 = "";
			
			System.out.println(null+stmt1); //null
	
			System.out.println(stmt1+null); //null
			
			System.out.println(stmt1.length()); //0
		
		
			String stmt = null;
			
			System.out.println(null+stmt); //nullnull

			System.out.println(stmt+null); //nullnull
			
			System.out.println(stmt.length()); //For this print NullPointerException
			
			
			String s;
			 
	        System.out.println(s);	//‘s’ is a local variable. Local variables must be initialized before they are used.
		
	}
}
