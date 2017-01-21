package com.OverLoadingIssues;
/*
 * sample code method overloading with implicit casting
 */
public class OverloadingImplicitCasting 
{
	public void m1(double d)
	{
		System.out.println(" double arg");
	}
    
	public static void main(String a[])
	{    
		OverloadingImplicitCasting s=new OverloadingImplicitCasting();
		s.m1(10);      //int //double arg
		s.m1(10.5);   // double //double arg
		s.m1('a');     // char //double arg
	}
}
