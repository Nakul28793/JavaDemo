package com.BT.DataTypes;
/*
 * 	every primitives( byte,short,int,long) in an expression is first converted into int then the expression is evaluated 
 	now if we are assigning the result of the expression to narrower primitives(like byte or short) without explicitly typecasting it 
 	then it will cause compiler error.

	LINE 3: Type mismatch: cannot convert from int to short

	LINE 4: Type mismatch: cannot convert from int to byte
 */
public class S {

	public static void main(String agr[])
	{
		short s1=4;       //LINE 1
	
		short s2 = s1+=s1;  //LINE 2
	
		short s3= s1+s2;     //LINE 3  //Type mismatch: cannot convert from int to short
		int s31= s1+s2;
		short s32= (short)(s1+s2);
		
		byte b1=(byte)s1 +(byte)s2;  //LINE 4 //Type mismatch: cannot convert from int to byte
		int b11=(byte)s1 +(byte)s2;
		byte b12=(byte)((byte)s1 +(byte)s2);
		
		
		byte b2=(byte)((byte)s1 +(byte)(byte)s2);  //LINE 5
	
	}
}