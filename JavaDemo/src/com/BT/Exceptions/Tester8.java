package com.BT.Exceptions;
/*
 * Unreachable catch block for ArithmeticException. It is already handled by the catch block for RuntimeException 
 * Compilation error
 */
public class Tester8 {

	public static void main(String[] args) 
	{
		try 
		{
			throw new RuntimeException();
		} 
		catch (RuntimeException e) 
		{
			System.out.println("RuntimeException");
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception");
		}
	}
}
