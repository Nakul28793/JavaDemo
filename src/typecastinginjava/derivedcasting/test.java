package typecastinginjava.derivedcasting;

class A
{
	int i = 10;
}
 
class B extends A
{
	int j = 20;
}
 
class C extends B
{
	int k = 30;
}
 
class D extends C
{
	int l = 40;
}
 
public class test
{
	public static void main(String[] args)
    {
		A a = new A();
							System.out.println(a.i);
							//System.out.println(a.j);	//j cannot be resolved or is not a field
							//System.out.println(a.k);	//k cannot be resolved or is not a field
							//System.out.println(a.l);	//l cannot be resolved or is not a field
       // B b = (B)a;		//A type is explicitly down casted to B type  
        				//compiles ok but produces runtime error
		B b = new B();
		A ab = b; // compiles ok (B is subclass of A)
		B b01 = (B) ab; // compiles and runs ok (ab is type B)					
        					System.out.println(b.i);
							System.out.println(b.j);	//j cannot be resolved or is not a field
							//System.out.println(b.k);	//k cannot be resolved or is not a field
							//System.out.println(b.l);	//l cannot be resolved or is not a field
							
		C c = (C) b01;    //Here, you will get class cast exception
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
			
							
				
							
    }
}
