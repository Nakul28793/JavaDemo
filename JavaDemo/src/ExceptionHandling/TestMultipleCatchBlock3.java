package ExceptionHandling;

public class TestMultipleCatchBlock3 {
	public static void main(String args[]) {
		try 
		{
			int a[] = new int[5];
			a[4] = 30;
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Task 2 is completed");
		} 
		catch (Exception e) 
		{
			System.out.println("Common task completed");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Task 1 is completed");
		}
		
		System.out.println("Rest of the code...");
	}
}