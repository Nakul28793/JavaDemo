package OverrodingIssues;
/*
 * Imp-->For instance (or non-static) methods, the method is called according to the type of object being referred, 
 * not according to the type of reference, which means method calls is decided at run time
 * 
 * 
Q : 	Can we call sub class method using super class object? or can we call child class method using parent class? or can a super class call a subclass' method
 
Ans: 	Pc p2=new C();
		Yes we can assign sub class object to super class reference.
		So here Sub class object is created so memory allocated to all super class members
		so can we call all methods ?  No eventhough sub class object is created we can not call sub class methods because we assigned sub class object to super class reference.
		Then how its possible to call sub class methods?
		Yes its possible to call sub class methods using super class by type casting to sub class object .
		By type casting super class object to sub class object we can access all corresponding sub class and all super class methods on that reference.
 */
class Pc                        
{  
	public void m1()
	{ 
		System.out.println("parent");
	}        
    
	public void m2()
	{
		System.out.println("parent m2"); 
	}       
}                               

class C extends Pc                    
{  
	public void m1()
	{
		System.out.println("child");
	}            
   
	public void m3() 
	{ 
		System.out.println("child m3");
	}                     
}        

public class Sample 
{
    public static void main(String[] a)
    {   
	    Pc p1=new Pc();                                
	    p1.m1(); //parent                            
	    p1.m2(); //parent m2                                
	    //p1.m3();  //error(The method m3() is undefined for the type Pc)
    
	    C c=new C();
	    c.m1();  //child
	    c.m2();  //parent m2
	    c.m3();  //child m3
    
	    Pc p2=new C();
	    p2.m1();  //child
	    p2.m2();  //parent m2
	    //p2.m3();  //error(The method m3() is undefined for the type Pc)
	    ((C)p2).m3(); //child m3  Imp
    }
}




