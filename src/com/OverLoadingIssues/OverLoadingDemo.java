package com.OverLoadingIssues;
/*
 * Example code for method overloading
 */
public class OverLoadingDemo 
{
	public void m1()
    {
		System.out.println("no arg");
    }
    
	public void m1(int i)
    {
    	System.out.println("int arg");
    }
    
	public void m1(String i)
    {
    	System.out.println("String arg");
    }
    
	public static void main(String a[])
	{    
		OverLoadingDemo s=new OverLoadingDemo();
		s.m1();        //no arg
		s.m1(10);     //int arg
		s.m1("sun"); //String arg
		//s.m1(10.0f);
		//s.m1(11L);  //double arg
		s.m1('a');  //int arg
	}
}

