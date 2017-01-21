package com.OverLoadingIssues;
/*
 * Autoboxing , variable argument method
 * Auto boxing beats var-arg
 */
public class AvsV 
{
	public static  void  m1(Byte b1, Byte b2)
	{
		System.out.println("Byte, Byte");
	}
	static void m1(byte... i)
	{
		System.out.println("byte var arg");
	}
	public static void main(String a[])
	{
		byte b=5;
		m1(b,b);    //Byte ,Byte
	}
}
