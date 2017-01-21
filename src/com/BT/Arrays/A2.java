package com.BT.Arrays;

public class A2 {

	public static void main(String[] args) 
	{
		String entries[] = {"entry1","entry2"};

		int count=0; 

		while (entries [count++]!=null)
		{
			System.out.println(count);
		}

        System.out.println(count);
	}
}

/*
1
2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	at com.BT.Arrays.A2.main(A2.java:11)
*/

/*
 * 1 An Exception will be thrown 
 * 2 will be printed as part of the output
 */
/*
 * An ArrayIndexOutOfBoundsException would be thrown when count ==2 
 */
		

		
