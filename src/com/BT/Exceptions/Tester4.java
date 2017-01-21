package com.BT.Exceptions;
import java.io.IOException;
/*
 * 	If the Super class provides a constructor that throws a checked exception, 
 	then the sub classes must define an explicit constructor that also throws the same exception or one of its super types. 
 	For example class AirJet must declare a constructor like this

	AirJet(int x) throws IOException{...}
	
	Compile error at line 7, AirJet must declare a constructor that throws IOException or any of its supertypes
 */
class AirPlane4 
{
	public AirPlane4() throws IOException, RuntimeException {
		System.out.println("AirPlane");
	}
}
class AirJet4 extends AirPlane4 { } // line 7

public class Tester4 
{
	public static void main(String args[]) throws IOException { // line 10
	new AirPlane4(); // line 11
	}
}

//Default constructor cannot handle exception type IOException thrown by implicit super constructor. Must define an explicit constructor