package com.OverLoadingIssues;
/*
 * variable argument method vs normal method
 */
public class VarargNor 
{
	static  void  m1(int i)
	{
		System.out.println("Int");
	}
	static void m1(int... i)
	{
		System.out.println("var-arg int");
	}
	public static void main(String a[])
	{
		int i=10;
		m1(i);     //int
		m1(i,i);   //var-arg int
	}
}