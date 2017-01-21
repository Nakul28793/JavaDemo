package com.BT.Collections;

import java.util.Arrays;

public class Tester9 
{
	public static void main(String[] args) 
	{
		Integer[] arr = { 1, 2, 3 };
		System.out.println(Arrays.binarySearch(arr, 1)); // line 1  //0
		System.out.println(Arrays.binarySearch(arr, "javachamp")); // line 2
	}
}
/*
 * 0
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
	at java.lang.Integer.compareTo(Integer.java:37)
	at java.util.Arrays.binarySearch0(Arrays.java:2001)
	at java.util.Arrays.binarySearch(Arrays.java:1943)
	at com.BT.Collections.Tester9.main(Tester9.java:11)

*/
