package typecastinginjava.derivedcasting.explicitdowncasting;

class A1
{
	int i = 10;
}
 
class B1 extends A1
{
	int j = 20;
}
 
class C1 extends B1
{
	int k = 30;
}
 
class D1 extends C1
{
	int l = 40;
}
 
public class ExplicitDownCasting1
{
	public static void main(String[] args)
    {
		A1 a = new A1();
							System.out.println(a.i);
							//System.out.println(a.j);	//j cannot be resolved or is not a field
							//System.out.println(a.k);	//k cannot be resolved or is not a field
							//System.out.println(a.l);	//l cannot be resolved or is not a field
       /* B1 b = (B1)a;	//A type is explicitly down casted to B type  
        				//compiles ok but produces runtime error
        					System.out.println(b.i);
							System.out.println(b.j);	//j cannot be resolved or is not a field
							//System.out.println(b.k);	//k cannot be resolved or is not a field
							//System.out.println(b.l);	//l cannot be resolved or is not a field*/
		//Solution 1
		if(a instanceof B1)
		{ 
			B1 b = (B1)a;	//A type is explicitly down casted to B type  
							
				System.out.println(b.i);
				System.out.println(b.j);	//j cannot be resolved or is not a field
				//System.out.println(b.k);	//k cannot be resolved or is not a field
				//System.out.println(b.l);	//l cannot be resolved or is not a field
		}
		//Solution 2				
							B1 b1 = new B1();
							A1 a1b1 = b1; // compiles ok (B is subclass of A)
							B1 b01 = (B1) a1b1; // compiles and runs ok (a1b1 is type of B)*/
							System.out.println(b01.i);
							System.out.println(b01.j);
							//System.out.println(b01.k);	//k cannot be resolved or is not a field
							//System.out.println(b01.l);	//l cannot be resolved or is not a field
							
       
							
    }
}

