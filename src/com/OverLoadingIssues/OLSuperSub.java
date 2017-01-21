package com.OverLoadingIssues;
/*
 * Code to demonstrate method overloading by extending another class.
 * Rule #3: The overriding method must have same argument list.
 */
class Superclass
{
	public void m1()
    {
		System.out.println("no arg");
    }
}

public class OLSuperSub extends Superclass 
{
    public void m1(int i)
    {    
    	System.out.println("one arg");
    }
    
    public static void main(String a[])
    {    
    	OLSuperSub s=new OLSuperSub();
        s.m1();      // no arg
        s.m1(10);    // one arg
    }
}
