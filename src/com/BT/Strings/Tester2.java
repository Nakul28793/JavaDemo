package com.BT.Strings;
/*
 * == checks if they are referencing the same object, 
 * but equals() checks if they have the same value. 
 */
public class Tester2 {

	public static void main(String[] args) 
	{

        boolean stmt1 = "champ" == "champ";
        System.out.println(stmt1); //true

        boolean stmt2 = new String("champ").equals(new String("champ"));
        System.out.println(stmt2); //true

        boolean stmt3 = "champ".toString()=="champ";
        System.out.println(stmt3); //true

        System.out.println(stmt1 && stmt2 && stmt3);  //true

    	}
                                    
}
