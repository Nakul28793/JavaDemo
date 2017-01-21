package com.BT.Arrays;

public class Tester {

	static void test(int[] a) 
	{
		int[] b = new int[2];

		a = b;

		System.out.print(b.length); //2

		System.out.print(a.length); //2

	}

	public static void main(String[] args) 
	{
		int[] a = new int[5];

		test(a);

		System.out.print(a.length); //5

	}
}