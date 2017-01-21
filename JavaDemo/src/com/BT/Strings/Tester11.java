package com.BT.Strings;
/*
 * (//s to search white spaces)
 */
public class Tester11 {

	public static void main(String[] args) 
	{
		String stmt = "JavaChamp is here to help you";

		for (String token : stmt.split("//s")) {

			System.out.print(token + " "); //JavaChamp is here to help you 

		}
		
		System.out.println("\n");
		 String stmt1 = "JavaChamp1is2here3to4help5you";

		 for (String token : stmt1.split("//d")) {

		 System.out.print(token + " ");

		 }

		 
	}
}
