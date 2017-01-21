package com.BT.StaticAndinitBlocks;
/*
 * static1 static2 main init3 Bird Falcon
 */
class Bird {

	static 
	{
		System.out.println("static1 ");
	}

	{
		System.out.println("init3 ");
	}

	public Bird()
	{
		System.out.println("Bird ");
	}

	static 
	{		
		System.out.println("static2 ");
	}
}

public class Falcon extends Bird {

	Falcon()
	{
		System.out.println("Falcon ");
	}

	public static void main(String[] args) 
	{
		System.out.println("main ");
		
		new Falcon();
	}
}
/*
 * 	static1
	static2
	main
	init3
	Bird
	Falcon
*/