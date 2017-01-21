package PrivateConstructorIssues;

class Test 
{

    static Test get() 
    {
		// Call private constructor to make object.
		return new Test();
    }

    private Test() 
    {
    	System.out.println("Private constructor");
    }
}

public class Program 
{
    public static void main(String[] args) 
    {
    	// Get instance of Test class.
		Test t = Test.get();
		System.out.println(t != null);
    }
}