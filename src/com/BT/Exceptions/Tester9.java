package com.BT.Exceptions;

public class Tester9 {

	static void method() throws Exception 
	{
		throw new Exception();
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
				System.out.println("exception");
			} 
			finally 
			{
				System.out.println("finally");
			}
		}
	}
}	

//exception
//finally
