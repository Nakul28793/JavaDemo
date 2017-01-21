package Inheritance_In_Java.Usage_Of_Default_Members.pack1;
/*
2). Default or Package or No-Access Modifiers

Usage of Default members :

	Default members or members with No-Access modifiers are accessed or visible within the package only. It applies to outer classes also.

Inheritance Of Default Members :

	Default members can be inherited to sub classes within package.
 */
public class A
{
    int i;
 
    A()
    {
        //Constructor with default modifier
    }
 
    void methodOfClassA()
    {
        //Method with default access modifier
        System.out.println(i);
        B b = new B();
    }
 
    class B
    {
      //Inner Class with default access modifier
    }
}
 
class C extends A
{
    void methodOfClassC()
    {
        System.out.println(i);        //Default field can be inherited within package 
 
        A a = new A();
        System.out.println(a.i);     //Default field can be used within the package
        a.methodOfClassA();          //Default method can be used within the package
        A.B b = new A.B();           //Default inner class can be used within the package
    }
}