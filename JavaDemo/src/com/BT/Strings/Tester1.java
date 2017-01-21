package com.BT.Strings;
/*
Stmt 1 would evaluate to true because of the string constant pool.

Stmt 2 would evaluate to false, because they are two different objects.

Stmt 3 would evaluate to also false , because they are two different objects.
 */
public class Tester1 {
	
	public static void main(String[] args) 
	{
		boolean stmt1 = "champ" == "champ";
		System.out.println(stmt1); //true

		boolean stmt2 = new String("champ") == "champ";
		System.out.println(stmt2); //false

		boolean stmt3 = new String("champ") == new String("champ");
		System.out.println(stmt3); //false

		System.out.println(stmt1 && stmt2 || stmt3);  //false
	}
}
