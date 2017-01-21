package OverrodingIssues;

class Pc2                        
{  
	static String name="Arpit";
	public void m1()
	{ 
		System.out.println("parent");
	}        
}                               

class C2 extends Pc2                    
{  
	String name="Kothari";
	public void m1()
	{
		System.out.println("child");
	}            
   
	public void m2() 
	{ 
		System.out.println("child m3");
	}                     
}        

public class TestCisco 
{
    public static void main(String[] a)
    {   
	    
    	Pc2 p2=new C2();
    	p2.name;
    	
    	Pc1 p3=null;
    	p3.name;
	    p2.m1();  //child
	    p2.m2();  //error
	}
}




