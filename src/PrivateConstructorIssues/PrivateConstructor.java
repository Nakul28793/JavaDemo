package PrivateConstructorIssues;
/*
 * Yes, a constructor can be private and a private constructor can be overloaded also.
 */
public class PrivateConstructor {

	private PrivateConstructor()
	{
		System.out.println("I am default private constructor");
	}
	
	private PrivateConstructor(int x)
	{
		System.out.println("I am overloaded private constructor. " +x);
	}
	
	public static void main(String args[])
	{
		PrivateConstructor pc1=new PrivateConstructor();
		PrivateConstructor pc2=new PrivateConstructor(10);
	}
}
