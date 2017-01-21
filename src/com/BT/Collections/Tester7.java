package com.BT.Collections;

import java.util.Arrays;

public class Tester7{
	
	public static void main(String[] args) 
	{
		String[] arr = { "java", "champ", "champion" };
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, "champion")); //1
		System.out.println(Arrays.binarySearch(arr, "You")); //-1
	}
}
