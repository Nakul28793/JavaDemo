package com.BT.Strings;

public class Tester16 {
	
	public static void main(String[] args) 
	{
		String str = "java";

		StringBuffer sb = new StringBuffer("javachamp");

		sb.insert(9, ".com"); //javachamp.com

		str.concat("champ");

		if (sb.length() < 6 || str.equals("javachamp")) 
		{
			System.out.print(sb);
		}

		sb.delete(2, 7); //Start from index 2 is inclusive and 7 is exclusive sb content will be deleted from 2nd index to 6th index , not 7th.

		System.out.print(sb); //jamp.com
 
	}
}
