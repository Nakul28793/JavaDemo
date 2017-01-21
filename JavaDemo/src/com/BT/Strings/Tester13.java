package com.BT.Strings;
/*
 * Strings are immutable. s.concat() will produce a new String object and will not modify the original String object s. 
 */
public class Tester13 {

	public static void main(String[] args) 
	{
		String s = "";

		Integer x = 5;

		StringBuffer sb = new StringBuffer();

		if (x < 15)

			s.concat("javachamp");

		else

			sb.append("javachamp");

		    System.out.print(s + sb); //No output is produced
		    System.out.println(s.concat("javachamp")+sb); //javachamp
	}
}
