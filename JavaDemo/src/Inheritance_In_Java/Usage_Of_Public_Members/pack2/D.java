package Inheritance_In_Java.Usage_Of_Public_Members.pack2;

import Inheritance_In_Java.Usage_Of_Public_Members.pack1.A;

public class D extends A
{
    void methodOfClassD()
    {
        System.out.println(i);        //public field can be inherited to any sub class 
 
        A a = new A();
        System.out.println(a.i);     //Public field can be used anywhere
        a.methodOfClassA();          //Public method can be used anywhere
        A.B b = new A.B();           //Public inner class can be used anywhere
    }
}