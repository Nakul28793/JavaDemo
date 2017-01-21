package ExceptionHandling;

import java.io.IOException;

/*
1)finally block will execute every time. 
	The only case when it does not execute is when it encounters System.exit().
2)finally clause overrides the value returned by try and catch blocks

Q 1) In Java, will the code in the finally block be called and run after a return statement is executed?
Ans) The answer to this question is a simple yes â€“ the code in a finally block will take precedence over the return statement

Q 2) Very unique situations when finally will not run after return
Ans) The finally block will not be called after return in a couple of unique scenarios: if System.exit() is called first, or if the JVM crashes. 

Q 3) What if there is a return statement in the finally block as well?
Ans) If you have a return statement in both the finally block and the try block, 
	 then you could be in for a surprise. Anything that is returned in the finally block will actually override any exception 
	 or returned value that is inside the try/catch block. 

Q 4) A return statement in the finally block is a bad idea
Ans) Running the method above will return a â€œ43â€³ and the exception in the try block will not be thrown. 
	 This is why it is considered to be a very bad idea to have a return statement inside the finally block. 
	 
	 	 
If try-catch-finally blocks(try-catch-finally||try-catch||try-finally) are returning a value , 
then you should not keep any statements after finally block. 
Because they become unreachable and in Java, Unreachable code gives compile time error.	

*/
public class FinallyDemo {

	public static int myMethod()
	{
//finally block will be always executed if there is a return statement in try-catch block. PFB the example –
		
		try 
		{
			return 10; //control will not be passed to main() method here
		}
		finally 
		{
			System.out.println("finally block is run before method returns");
			//Control will be passed to main() method after executing this block
		}
		//System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
		
	}
	
	public static int methodReturningValue()
	{
//Does finally block Overrides the values returned by try-catch block?

//Yes. finally block overrides the value returned by try and catch blocks. Consider below example –
		try
		{
			int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
			//int i = Integer.parseInt("123");
		    return 10;
		} 
		finally 
		{
			return 50; //This method returns 50 not 10		
		}
		//System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
	}
  
	public static int getANumber()
	{
		try
		{
			throw new NoSuchFieldException();
		} 
		finally 
		{
			return 50;
		}
		//System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
	}
	
	public static int getANumber1()
	{
		try
		{
			throw new Exception();
		}
		catch(Exception e)
		{	
			return 20;
		}
		finally 
		{
			return 50;
		}
		//System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
	}
	
	
	public static int getANumber2()
	{
		try
		{
			throw new Exception();
		}
		catch(Exception e)
		{	
			throw new NoSuchFieldException();
		}
		finally 
		{
			return 50;
		}
		//System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
	}
	
	public static void getANumber3()
	{
		try 
		{
			System.out.println("Inside try block getANumber3");
			throw new Exception();
		}
		catch (Error err) 
		{
			System.out.println(err);			
		}
		catch (Exception exp) 
		{
			System.out.println(exp);			
		}
		catch (Throwable thr) 
		{
			System.out.println(thr);			
		}
		finally 
		{
			return;
		}
		//return; //No, remove last “return” statement. Because, it is unreachable.
		//System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
	}
  
	public static String methodReturningValue1()
    {
        String s = null;
        try
        {
            s = "return value from try block";
            return s;
        }
        catch (Exception e)
        {
            s = s + "return value from catch block";
            return s;
        }
        finally
        {
            s = s + "return value from finally block";
            //return s; //return value from try blockreturn value from finally block
        }
    }
	
	public static int methodReturningValue2()
    {
        int i = 0;
 
        try
        {
            i = 1;
            return i;
        }
        catch (Exception e)
        {
            i = 2;
            return i;
        }
        finally
        {
            i = 3;
        }
    }
	
	public static int methodReturningValue3()
    {
        int i = 0;
 
        try
        {
            i = 1;
            return i;
        }
        catch (Exception e)
        {
            i = 2; 
        }
        finally
        {
            i = 3;
        }
 
        return i;
    }

	public static void getANumber4()
	{
		try 
		{
			//try block
			System.out.println("Inside try block getANumber4");
			System.exit(0);
		}
		catch (Exception exp) 
		{
			System.out.println(exp);
		}
		finally 
		{
			System.out.println("Java finally block");
		}
	}
	
	public static void getANumber5()
	{
		try 
		{
			//try block
			System.out.println("Inside try block getANumber5");
			throw new Exception();
		}
		catch (Exception exp) 
		{
			System.out.println(exp);
			System.exit(0);
		}
		finally 
		{
			System.out.println("Java finally block");
		}
	}
	public static void main(String args[])
	{
		System.out.println(FinallyDemo.myMethod());
		//finally block is run before method returns
		//10
		System.out.println("");
		System.out.println(FinallyDemo.methodReturningValue());
		//50
		
		System.out.println("");
		System.out.println(FinallyDemo.getANumber());
		//50
		
		System.out.println("");
		System.out.println(FinallyDemo.getANumber1());
		//50
		

		System.out.println("");
		System.out.println(FinallyDemo.getANumber2());
		//50
		
		FinallyDemo.getANumber3();
		//Inside try block getANumber3
		//java.lang.Exception
		
		System.out.println("");
		System.out.println(FinallyDemo.methodReturningValue1());
		//return value from try block
		
		System.out.println("");
		System.out.println(FinallyDemo.methodReturningValue2());
		//1
		
		System.out.println("");
		System.out.println(FinallyDemo.methodReturningValue3());
		//1
		
		//FinallyDemo.getANumber4();
		//Inside try block getANumber4
		
		//FinallyDemo.getANumber5();
		//Inside try block getANumber5
		//java.lang.Exception
	}
}