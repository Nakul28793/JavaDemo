package com.BT.Arrays;
/*
 * JVM automatically converts the result to the integer,So integer can't store into the byte. So It gets compile error 
 */
public class A4 {
	
	public static void main(String[] args)
	{

		byte b1= 25;
	
		byte b2= 45;
	
		byte b3= b1+b2; //CompileError
		
		int b4= b1+b2;
		
		byte b5= (byte)(b1+b2);
		
		//b1=b1*2;
		//since 2 is integer and when integer is multiplied with byte result will be integer so explicit type cast to byte is required to avoid compiler error.
		b1=(byte) (b1*2); 

	}
}
