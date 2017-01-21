package com.BT.Arrays;
/*

i. java Arrays

ii. java Arrays 12

iii. java Arrays 12 32

*/
public class Arrays {
		
	public static void main(String [ ] args)
	{
		for(int x=0;args.length>x++;)
		{
			System.out.print(args[x]+ " ");
		}
	}

}
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
	at com.BT.Arrays.Arrays.main(Arrays.java:17)

32 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	at com.BT.Arrays.Arrays.main(Arrays.java:17)
*/
/*
A. Only the invocation i will complete without throwing exceptions
Invocations ii and iii will throw exceptions.
*/