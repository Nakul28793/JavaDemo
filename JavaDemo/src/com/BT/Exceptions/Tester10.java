package com.BT.Exceptions;
/*
 * Static method() must handle the exception by either enclose it within a try/catch block or declare it in its header 
 * Compilation error
 */
public class Tester10 {

	static void method()
	{
		throw new Exception();
		//throw new ArithmeticException(); //it will work
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			method();
		} 
		catch (Throwable e) 
		{
			try 
			{
				throw new Exception() ;
			} 
			catch (Exception ex) 
			{
				System.out.print("exception");
			} 
			finally 
			{
				System.out.print("finally");
			}
		}
	}
}	