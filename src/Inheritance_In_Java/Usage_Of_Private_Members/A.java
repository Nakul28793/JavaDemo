package Inheritance_In_Java.Usage_Of_Private_Members;
/*
1). Private

Usage of Private members :

	Private members of a class whether it is a field or method or constructor can not be accessed outside the class.

Inheritance of Private Members :

	Private members will not be inherited to sub class.

Important Note :

	1). Class can not be a private except inner classes. Inner classes are nothing but again members of outer class. 
	    So members of a class (field, method, constructor and inner class) can be private but not the class itself.

	2). We can’t create sub classes to that class which has only private constructors.
 */
public class A
{
    private int i;
 
    private void methodOfClassA()
    {
        //Private Method
        System.out.println(i);	//Private field can be used within class
        B b = new B();          //Private inner class can be used within class
    }
 
    private class B
    {
      //Private Inner Class
    }
}
 
class C extends A
{
    void methodOfClassC()
    {
        //System.out.println(i);			Private member can not be inherited
        A a = new A();
        //System.out.println(a.i);     		Private field can not be used outside the class
        //a.methodOfClassA();          		Private method can not be used outside the class
        //A.B b = new A.B();           		Private inner class can not be used outside the class
    }
}