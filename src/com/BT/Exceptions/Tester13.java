package com.BT.Exceptions;

public class Tester13 {

	public static void main(String[] args) 
	{
		String stmt = "javachamp 2009";
		String[] arr = stmt.split(" ");
		try 
		{
			int x = Integer.parseInt(arr[0]);
			System.out.println(x);
		} 
		catch (Exception e) 
		{
			System.out.println("catch");
		} 
		finally 
		{
			System.out.println("finally");
		}
	}
}
//catch
//finally
