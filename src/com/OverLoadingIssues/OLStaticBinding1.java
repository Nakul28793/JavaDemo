package com.OverLoadingIssues;
class AnimalA
{
}

class MonkeyM extends AnimalA
{
}

class LionsL extends MonkeyM
{
}

public class OLStaticBinding1 
{
	public void m1(AnimalA a)
    {     
		System.out.println("Animal version");
    }
    
	public void m1(MonkeyM m)
    {     
		System.out.println("Monkey version");
    }
	public void m1(Object obj)
    {     
		System.out.println("Object version");
    }
    
	public static void main(String a[])
    {
		OLStaticBinding1 s=new OLStaticBinding1();
		AnimalA a1 =new AnimalA();
        s.m1(a1);                   // Animal version
        MonkeyM m =new MonkeyM();
        s.m1(m);                  // Monkey version
        AnimalA a2 =new MonkeyM();
        s.m1(a2);                // Animal version  
        //Here method execute based on the reference  a2 type
        
        LionsL l =new LionsL();
        s.m1(l); // Monkey version
        AnimalA a3 =new LionsL();
        s.m1(a3); // Animal version
    }
}


