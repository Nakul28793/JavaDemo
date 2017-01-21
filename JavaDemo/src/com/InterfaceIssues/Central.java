package com.InterfaceIssues;
/*
 * 14) Methods with same signature but different return type can’t be implemented at a time for two or more interfaces.
 */
interface A
{
	public void aaa();
}
interface B
{
	public int aaa();
}

class Central implements A,B
{

	public void aaa() // error
	{
	}
	public int aaa() // error
	{
	}
	public static void main(String arg[])
	{

	}
}