package com.BT.Arrays;
/*
 * Allowed indexes for array x are from 0 to 4, else ArrayIndexOutOfBoundsException is thrown 
 */
public class Tester1 {

	final static int x[] = new int[5];

	public static void main(String[] args) 
	{
		final int x = new Tester1().x[5];
		//      OR
		//final int x = Tester1.x[5];
		//		Actual Code 
		//final int x = Tester1.x[4];

		if (x <= 10)
		{
			System.out.println("javachamp");
		}
	}
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	at com.BT.Arrays.Tester1.main(Tester1.java:9)
*/
/*
 * The only problem is forgetting that an array's index starts at 0, 
 * so its last element would be at index 4 not 5. If it would be "new Tester().x[4]" then... try it
 * 
 * */
