package com.OverLoadingIssues;
/*
 * method overloading by passing objects
 */

public class OLbyPassingObject 
{
    public void m1(String s)
    {      
    	System.out.println("String version");
    }
    
    public void m1(Object o)
    {    
    	System.out.println("Object version"); 
    }
    
    public void m1(double d)
    {
    	System.out.println("double version");  
    }

    public void m1(int i)
    {
        System.out.println(1);
    }
 
    public void m1(Integer I)
    {
        System.out.println(2);
    }
 
    
    public static void main(String a[])
    {
    	OLbyPassingObject s=new OLbyPassingObject();
	    s.m1("java");          // String version
	    s.m1(new Object());   // Object version
	    //s.m1(null);          
	    
	    s.m1(10);   //1
	    
	    s.m1(10.25);  //double version
 
	    s.m1(new Double("25.25")); //Object version
	}
}