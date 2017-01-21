package com.AbstractIssues;


abstract class A {
	  
	public Object getTypeName()
	{
		return "Type";
	}
	
	public synchronized void sm()
    {
		System.out.println("super class");
    }
	
	public void m1()
	{ 
		System.out.println("parent m1");
	}        
    
	public void m2()
	{
		System.out.println("parent m2"); 
	}       
	/*public void doit(){
        System.out.println("This method is in A..");
    }
  
    
    public abstract void tryit();*/
  
}
  
public class B extends A{
  
	public String getTypeName()
	{
		return "SubType";
	}
	
	public void sm()
    {    
        System.out.println("sub class");
    }
	
	public void m3() 
	{ 
		System.out.println("child m3");
	} 
	
	/*public void doit(){
	       System.out.println("This is a method in A which is Overriden");
	    }
	  
	public void tryit() {
	        System.out.println("tryit in B implemented");
	    }*/
	
	
	
	public static void main(String[] args) {
  
		B b = new B();
		System.out.println(b.getTypeName());
		b.sm();
		b.m2();

		A a = new B();
		System.out.println(a.getTypeName());
		a.sm();
		a.m2();
		//a.m3();
	  
		
      /*b.doit();
      b.tryit();
  
      
      a.doit();
      a.tryit();*/
    }
  
    
  
}