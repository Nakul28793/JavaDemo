package typecastinginjava.derivedcasting.autoupcasting;
/*
 * http://javaconceptoftheday.com/type-casting-in-java/
 */
class A
{
	//static int i = 10;
		int i = 10;
}
 
class B extends A
{
	//static int j = 20;
		int j = 20;
}
 
class C extends B
{
	//static int k = 30;
		int k = 30;
}
 
class D extends C
{
	//static int l = 40;
		int l = 40;
}
 
public class AutoUpCasting
{
	public static void main(String[] args)
    {
		D d = new D();
						System.out.println(d.i);
				        System.out.println(d.j);
				        System.out.println(d.k);
				        System.out.println(d.l);
        C c = d;	// D type object is Auto-Up Casted to C type
      //C c = new D();	// D type object is Auto-Up Casted to C type  //reference variable of Base class points object of Derived class
        				System.out.println(c.i);
				        System.out.println(c.j);
				        System.out.println(c.k);
				        //System.out.println(c.l);	//l cannot be resolved or is not a field
        B b = d;	// D type object is Auto-Up Casted to B type
      //B b = new D();	// D type object is Auto-Up Casted to B type
				        System.out.println(b.i);
				        System.out.println(b.j);
				        //System.out.println(b.k);	//k cannot be resolved or is not a field
				        //System.out.println(b.l);	//l cannot be resolved or is not a field
        A a = d;	// D type object is Auto-Up Casted to A type
      //A a = new D();	// D type object is Auto-Up Casted to A type
				        System.out.println(a.i);
				        //System.out.println(a.j);	//j cannot be resolved or is not a field
				        //System.out.println(a.k);	//k cannot be resolved or is not a field
				        //System.out.println(a.l);	//l cannot be resolved or is not a field
         
        C c1 = new C();
				        System.out.println(c1.i);
				        System.out.println(c1.j);
				        System.out.println(c1.k);
				        //System.out.println(c1.l);	//l cannot be resolved or is not a field
				        
		B b1 = c1;	// C type object is Auto-Up Casted to B type
						System.out.println(b1.i);
						System.out.println(b1.j);
						//System.out.println(b1.k);	//k cannot be resolved or is not a field
						//System.out.println(b1.l);	//l cannot be resolved or is not a field
						
		A a1 = c1;	// C type object is Auto-Up Casted to A type
						System.out.println(a1.i);
						//System.out.println(a1.j);	//j cannot be resolved or is not a field
						//System.out.println(a1.k);	//k cannot be resolved or is not a field
						//System.out.println(a1.l);	//l cannot be resolved or is not a field
						
		B b2 = new B();
						System.out.println(b2.i);
						System.out.println(b2.j);
						//System.out.println(b2.k);	//k cannot be resolved or is not a field
						//System.out.println(b2.l);	//l cannot be resolved or is not a field	
						
		A a2= b2;	// B type object is Auto-Up Casted to A type
	  //A a2 = new B(); // B type object is Auto-Up Casted to A type
						System.out.println(a2.i);
						//System.out.println(a2.j);	//j cannot be resolved or is not a field
						//System.out.println(a2.k);	//k cannot be resolved or is not a field
						//System.out.println(a2.l);	//l cannot be resolved or is not a field
				       
		A a3 = new A();
						System.out.println(a3.i);
						//System.out.println(a3.j);	//j cannot be resolved or is not a field
						//System.out.println(a3.k);	//k cannot be resolved or is not a field
						//System.out.println(a3.l);	//l cannot be resolved or is not a field					
		
        
    }
}
