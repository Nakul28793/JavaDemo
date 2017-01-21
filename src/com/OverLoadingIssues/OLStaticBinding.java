package com.OverLoadingIssues;
/*
 * example code static binding
 * In the case of overloading the method resolution performed by the compiler is based on the reference type.
 */
class Animal
{
}

class Monkey extends Animal
{
}

public class OLStaticBinding 
{
	public void m1(Animal a)
    {     
		System.out.println("Animal version");
    }
    
	public void m1(Monkey m)
    {     
		System.out.println("Monkey version");
    }
    
	public static void main(String a[])
    {
		OLStaticBinding s=new OLStaticBinding();
        Animal a1 =new Animal();
        s.m1(a1);                   // Animal version
        Monkey m =new Monkey();
        s.m1(m);                  // Monkey version
        Animal a2 =new Monkey();
        s.m1(a2);                // Animal version  
        //Here method execute based on the reference  a2 type
    }
}

