package typecastinginjava.derivedcasting.explicitdowncasting;

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
 
public class ExplicitDownCasting
{
	public static void main(String[] args)
    {
		A a = new A();
							System.out.println(a.i);
							//System.out.println(a.j);	//j cannot be resolved or is not a field
							//System.out.println(a.k);	//k cannot be resolved or is not a field
							//System.out.println(a.l);	//l cannot be resolved or is not a field
        B b = (B)a;		//A type is explicitly down casted to B type  
        				//compiles ok but produces runtime error
        					System.out.println(b.i);
							System.out.println(b.j);	//j cannot be resolved or is not a field
							//System.out.println(b.k);	//k cannot be resolved or is not a field
							//System.out.println(b.l);	//l cannot be resolved or is not a field
			//Solution				
							/*B b = new B();
							A ab = b; // compiles ok (B is subclass of A)
							B b01 = (B) ab; // compiles and runs ok (ab is type B)*/
							
        C c = (C)a;   	//A type is explicitly down casted to C type 
        				//compiles ok but produces runtime error
					        System.out.println(c.i);
							System.out.println(c.j);	
							System.out.println(c.k);	
							//System.out.println(c.l);	//l cannot be resolved or is not a field
        D d = (D)a;   	//A type is explicitly down casted to D type 
        				//compiles ok but produces runtime error
					        System.out.println(d.i);
							System.out.println(d.j);	
							System.out.println(d.k);	
							System.out.println(d.l);
        B b1 = new B();
					        System.out.println(b1.i);
							System.out.println(b1.j);
							//System.out.println(b1.k);	//k cannot be resolved or is not a field
							//System.out.println(b1.l);	//l cannot be resolved or is not a field
		C c1 = (C)b1;	//B type is explicitly down casted to C type 
						//compiles ok but produces runtime error
	    					System.out.println(c1.i);
							System.out.println(c1.j);
							System.out.println(c1.k);	
							//System.out.println(c1.l);	//l cannot be resolved or is not a field
		D d1 = (D)b1;	//B type is explicitly down casted to D type 
						//compiles ok but produces runtime error
							System.out.println(d1.i);
							System.out.println(d1.j);
							System.out.println(d1.k);	
							System.out.println(d1.l);
		C c2 = new C();
					        System.out.println(c2.i);
							System.out.println(c2.j);
							System.out.println(c2.k);
							//System.out.println(c2.l);	//l cannot be resolved or is not a field
		D d2 = (D)c2;	
		//D d2 = (D) new C(); 
						//C type is explicitly down casted to D type 
						//compiles ok but produces runtime error
							System.out.println(d2.i);
							System.out.println(d2.j);
							System.out.println(d2.k);	
							System.out.println(d2.l);
		D d3 = new D();	
							System.out.println(d3.i);
							System.out.println(d3.j);
							System.out.println(d3.k);	
							System.out.println(d3.l);					
							
    }
}
