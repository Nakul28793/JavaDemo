package OverrodingIssues;
/*
 * Super class instance method,sub class static method
 * super class static method sub class instance method
 * Imp->An instance method cannot override a static method, and a static method cannot hide an instance method
 */
class Parentclass 
{
	
	public void sm()
	{
		System.out.println("super class");
	}
	
	public static void sm1()
	{
		System.out.println("super class");
	}
}

public class InstanceMethodsStaticMethodsOverridingIssues extends Parentclass
{
	public static void sm()  // compile time error
	//This static method cannot hide the instance method from Parentclass
	{ 
		System.out.println("sub class");
	}
	
	public void sm1()  // compile time error
	//This instance method cannot override the static method from Parentclass
	{ 
		System.out.println("sub class");
	}
  
	public static void main(String a[])
	{ 
		InstanceMethodsStaticMethodsOverridingIssues s=new InstanceMethodsStaticMethodsOverridingIssues();
		s.sm();   
	}
}
