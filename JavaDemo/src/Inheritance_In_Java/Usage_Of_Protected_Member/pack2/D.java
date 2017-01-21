package Inheritance_In_Java.Usage_Of_Protected_Member.pack2;

import Inheritance_In_Java.Usage_Of_Protected_Member.pack1.A;

public class D extends A
{
    void methodOfClassD()
    {
        System.out.println(i);        //Protected field can be inherited to any sub class 
 
        A a = new A();  //if we create protected constructors then we can’t create objects to that class outside the package.
        //System.out.println(a.i);     Protected field can not be used outside the package
        //a.methodOfClassA();          Protected method can not be used outside the package
        //A.B b = new A.B();           Protected inner class can not be used outside the package
    }
}