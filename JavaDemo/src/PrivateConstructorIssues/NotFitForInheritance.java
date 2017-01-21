package PrivateConstructorIssues;
/*
 * The subclass NotFitForInheritance() constructor calls super class PrivateConstructorDemoBase() constructor implicitly. 
 * But it cannot as PrivateConstructorDemoBase() constructor has private access. For this reason, PrivateConstructorDemoBase() cannot be extended by any other class,
 */
class PrivateConstructorDemoBase 
{
	private PrivateConstructorDemoBase()
	{
		System.out.println("I am default private constructor");
	}
	
	private PrivateConstructorDemoBase(int i)
	{
		System.out.println("I am default private constructor");
	}
}

public class NotFitForInheritance extends PrivateConstructorDemoBase
{
	//error : Implicit super constructor PrivateConstructorDemoBase() is not visible for default constructor. 
	//		  Must define an explicit constructor
	
	/*public static void main(String args[])
	{
		NotFitForInheritance nFFI=new NotFitForInheritance();
		PrivateConstructorDemoBase pCDB=new NotFitForInheritance();
	}*/
}
