package com.OverLoadingIssues;
/*
 * widening ,variable argument method
 * widening always beats var arg
 */
public class WvsV {
	
	static  void  m1(int i, int j)
    {
		System.out.println("Int,int");
    }
    static void m1(byte... i)
    {
        System.out.println("byte var arg");
    }
    public static void main(String a[])
    {
        byte b=5;
        m1(b,b);   //Int,int
    }
}
