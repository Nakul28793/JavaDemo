package OverrodingIssues;
/*	Can static methods be overridden?
 	The static methods can not be overridden!
 	Can we override static methods in java
 	Exact answer is NO. We can not override static methods.
 * 
 * super class ,sub class static methods
 * Imp--> For class (or static) methods, the method according to the type of reference is called, 
   not according to the object being referred, which means method call is decided at compile time
 * Imp-->private, static and final methods can not be overridden 
 * Rule #10: A static method in a subclass may hide another static one in a superclass, and that’s called hiding.
 * http://www.codejava.net/java-core/the-java-language/12-rules-of-overriding-in-java-you-should-know
 * */ 

class Pc1                        
{  
	static void m1()
	{ 
		System.out.println("parent");
	}        
}           

class C1 extends Pc1                    
{  
	static void m1()
	{
		System.out.println("child");
	}   
	
	void doSomething() 
	{
		m1();    // this calls the hiding method
 
        // because the Pc1 m1() is hidden, it requires to use
        // a fully qualified class name to access it.
		super.m1();
		Pc1.m1();
    }
}        

public class MethodHiding 
{
	public static void main(String[] ar)
    {   
		Pc1 p1=new Pc1();                                
	    p1.m1(); //parent  //BAD STYLE
	    Pc1.m1();//parent  //Better!
	    
	    C1 c1=new C1();
	    c1.m1(); //child
	    C1.m1(); //child
	    c1.doSomething();
	    
		Pc1 p=new C1();
		p.m1();   //parent  //BAD STYLE
		Pc1.m1();//parent  //Better!
        // method execution based on the reference type  in method hiding
        // method execution based on the object    type  in method overriding
		
		Pc1 pc=new C1();
		C1 cc=(C1) pc;
		cc.m1(); //child
    }
}

