package com.BT.Strings;
/*Output: Boolean Int
The default delimiter is a space, therefore the literal is tokenized into four token :
javachamp
2009,
true
239
 */
import java.util.Scanner;

public class Tester15 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner("javachamp 2009, true 239"); //Output: Boolean Int
		
		//Scanner sc = new Scanner("javachamp 2009 true 239"); //Output:Int Boolean Int

		while (sc.hasNext()) 
		{
			if (sc.hasNextBoolean())

				System.out.println("Boolean");

			if (sc.hasNextInt())

				System.out.println("Int");

			sc.next();

		}
	}
}	
