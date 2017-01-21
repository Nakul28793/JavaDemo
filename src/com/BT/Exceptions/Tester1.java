package com.BT.Exceptions;
/*
 * Implicit call to super() will be called, print Father, then throws IOExeption. The remaining of the code in Son constructor won't be continued 
 */
import java.io.IOException;

class Father 
{
	public Father() throws IOException 
	{
		System.out.println("Father"); //Father
		throw new IOException();
	}
}

class Son extends Father 
{
	public Son() throws IOException 
	{
		System.out.println("Son");
	}
}

public class Tester1 
{
	public static void main(String[] args) 
	{
		try 
		{
			new Son();
		} 
		catch (IOException e) 
		{
			System.out.println("Inside catch"); //Inside catch
		}
	}
}	