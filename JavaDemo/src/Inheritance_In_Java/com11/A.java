package Inheritance_In_Java.com11;
/*
	Effect of private, default, protected and public keyword on inheritance in java:
	
	private : Private members can not be inherited to sub class.
	
	Default : Default members can be inherited to sub class within package.
	
	protected : protected members can be inherited to any sub class but usage of protected member is limited within package.
	
	public : public members are inherited to all sub classes
 */
public class A
{
    private int i;
    int j;
    protected int k;
    public int m;
}
 
class B extends A
{
    void methodOfClassB()
    {
        //System.out.println(i);			//Private member can not be inherited
        System.out.println(j);			//Default member can be inherited within package
        System.out.println(k);			//protected member can be inherited to any subclass
        System.out.println(m);			//public member can be inherited to all sub classes
    }
}
 
class C extends B
{
    void methodOfClassC()
    {
    	System.out.println(j);		//Default member can be inherited within package
        System.out.println(k);		//protected member can be inherited to any subclass
        System.out.println(m);		//public member can be inherited to any subclass
 
        B b = new B();
        System.out.println(b.j);	//Default member can be used within package
        System.out.println(b.k);	//Protected member can be used anywhere in the package
        System.out.println(b.m);	//Public member can be used anywhere
    }
}
 
