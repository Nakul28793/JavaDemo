
public class HowCanWeCheckForTheComplexity {

	public static void f1(int n)
	{
		int x = n;
				while ( x > 0 ) 
				{System.out.println("x->"+x);
					int y = n;
					while ( y > 0 )
					{
						y = y / 2;
						System.out.println("y->"+y);
					}
			      
					x = x - 1;
				}
	}
	
	public static void main(String args[])
	{
		f1(5);
	}
}
