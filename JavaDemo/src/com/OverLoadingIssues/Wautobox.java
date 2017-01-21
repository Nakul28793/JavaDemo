package com.OverLoadingIssues;
/* widening autoboxing
 * Widening always beats autoboxing ie., compiler will 
give priority to widening than autounboxing(1.5 version) 
 */
public class Wautobox 
{
	public static void m1(Integer i)
	{
		System.out.println("Integer");
	}
	public static void m1(long l)
	{
		System.out.println("long");
	}
	public static void main(String a[])
	{
		int i=5;
	    m1(i);    //long
	}
}