package OverrodingIssues;

/*
 * super class final method sub class non-final method
 * super class non-final method, sub class final method
 */
class Superclass
{
	final void m1()
	{
		System.out.println("Super class method");
	}
	
	void m2()
	{
	    System.out.println("Super class method");
	}
}

public class FinalMethodIssuesInOverriding extends Superclass 
{

	void m1() // compile time error 
	//Can not override the final method from Superclass
    {
        System.out.println("Sub class method");
    }
	
	 final void m2() //no error
	 {
		 System.out.println("Sub class method");
	 }
    
	public static void main(String[] args) 
	{
		FinalMethodIssuesInOverriding  s=new FinalMethodIssuesInOverriding();
        s.m1(); 
        s.m2();//Sub class method
    }
}