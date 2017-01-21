package ExceptionHandling;

public class T {

	public static int demo()
	{
		try
		{
			System.out.println("try");
			throw new Exception();
			//return 10;
		}
		finally
		{
			System.out.println("finally");
			return 20;
		}
	}
	
	public static void main(String args[])
	{
	 demo();
	 //T.demo();
	 //System.out.println(demo());
	 //System.out.println(T.demo());
	}
}
