package Inheritance_In_Java.Usage_Of_Protected_Member.pack1;
/*
3). Protected

Usage of Protected Member :
	
	Protected member can be used within the package only.

Inheritance Of Protected Member :

	Protected Member can be inherited to any sub classes.

Important Note :

	1). Outer class can not be protected.

	2). We can create sub classes to a class which has only protected constructors but we can’t create objects to that class outside the package.
 */
public class A
{
    protected int i;
    
    /*protected A()
    {
        //Constructor with Protected  modifier
    }*/
 
    protected void methodOfClassA()
    {
        //Protected method
        System.out.println(i); //Protected field can be used within class
        B b = new B();         //Protected Inner Class can be used within class.
    }
 
    protected class B
    {
      //Protected Inner Class
    }
}
 
class C extends A
{
    void methodOfClassC()
    {
        System.out.println(i);        //Protected field can be inherited to any sub class 
 
        A a = new A();
        System.out.println(a.i);     //Protected field can be used within the package
        a.methodOfClassA();          //Protected method can be used within the package
        A.B b = new A.B();           //Protected Inner Class can be used within the package
    }
}
 
