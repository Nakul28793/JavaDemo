package com.OverLoadingIssues;
/*
 * sample code method overloading ambiguous problem
 */
public class OLAmbiguousProblem 
{
	public void m1(int i,float f)
	{
		System.out.println("int,float");
	}
     
	public void m1(float i,int f)
	{
		System.out.println("float,int");
	}
     
	public static void main(String a[])
	{
		OLAmbiguousProblem s=new OLAmbiguousProblem();
        s.m1(10,10.0f);  //int,float
        s.m1(10.0f,10);  //float,int
        //s.m1(10,10);   //invalid->The method m1(int, float) is ambiguous for the type OLAmbiguousProblem
        //s.m1(10.0f,10.0f);  //The method m1(float, int) in the type OLAmbiguousProblem is not applicable for the arguments (float, float)
	}
}