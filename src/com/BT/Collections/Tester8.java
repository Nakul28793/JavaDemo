package com.BT.Collections;

import java.util.Arrays;

public class Tester8 
{
	public static void main(String[] args) 
	{
		String[] arr = { "java", "champ", "you" };
		System.out.println(Arrays.binarySearch(arr, "java")); //-3
		System.out.println(Arrays.binarySearch(arr, "You")); //-1
	}
}
