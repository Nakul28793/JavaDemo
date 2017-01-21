package com.InterfaceIssues;

public class ab {

	public static void main(String args[])
	{
		System.out.println(Math.ceil(-4.0)); //-4.0
		System.out.println(Math.ceil(-4.1));//-4.0
		System.out.println(Math.ceil(-4.5));//-4.0
		System.out.println(Math.ceil(-4.6));//-4.0
		System.out.println(Math.ceil(-4.9));//-4.0
		
		
		System.out.println(Math.ceil(4.0));//4.0
		System.out.println(Math.ceil(4.1));//5.0
		System.out.println(Math.ceil(4.5));//5.0
		System.out.println(Math.ceil(4.6));//5.0
		System.out.println(Math.ceil(4.9));//5.0
	}
}
