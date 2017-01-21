package PrivateConstructorIssues;
/*
 *  Composition (or has-a relationship) is not possible with default constructor. 
 *  That is, you cannot create an object of the class in another class with default constructor.
 */
class PrivateConstructorDemo 
{
	private PrivateConstructorDemo()
	{
		System.out.println("I am default private constructor");
	}
}


public class CompositionIsNotPossible
{
	public static void main(String args[])
	{
		PrivateConstructorDemo pc1=new PrivateConstructorDemo();
		//error:-The constructor PrivateConstructorDemo() is not visible
	}
}
