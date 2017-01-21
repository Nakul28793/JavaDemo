package ExceptionHandling;

public class TestMultipleCatchBlock1 {
	public static void main(String args[]) {
		try 
		{
			int a[] = new int[5];
			a[5] = 30 / 0;
		} 
		catch (Exception e) 
		{
			System.out.println("Common task completed");
		}
		catch (ArithmeticException e) 
		{	//Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
			System.out.println("Task 1 is completed");
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{	//Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
			System.out.println("Task 2 is completed");
		} 
		
		System.out.println("Rest of the code...");
	}
}