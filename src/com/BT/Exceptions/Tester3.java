package com.BT.Exceptions;
import java.io.IOException;
class AirPlane 
{
	public AirPlane() 
	{
		System.out.println("AirPlane"); //AirPlane
	}
}

class AirJet extends AirPlane 
{
	public AirJet() throws IOException 
	{
		try 
		{
			throw new IOException();
		} 
		catch (IOException e) 
		{
			System.out.println("IOException is thrown in AirJet"); //IOException is thrown in AirJet
		}
	}
}

public class Tester3 
{
	public static void main(String args[]) 
	{
		try 
		{
			new AirJet();
		} 
		catch (IOException e) 
		{
			System.out.println("IOException is thrown in Tester3");
		}
	}
}

/*
 * AirPlane
 * IOException is thrown in AirJet
*/