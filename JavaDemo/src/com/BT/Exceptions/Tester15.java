package com.BT.Exceptions;
/*
 * Doubles and floats doesn't produce ArithmeticException when dividing by 0. 
 */
public class Tester15 
{
	public static void main(String[] args) 
	{
		Double d = -4.0;
		try 
		{
			d /= 0;
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("EXCEPTION!");
		} 
		finally 
		{
			System.out.println(d);
		}
	}
}
//-Infinity