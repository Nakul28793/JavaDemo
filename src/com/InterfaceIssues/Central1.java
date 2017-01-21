package com.InterfaceIssues;
/*
 * 13) If there are having two or more same methods in two interfaces and a class implements both interfaces, implementation of one method is enough.
 */
interface A1
{
	public void aaa();
}
interface B1
{
	public void aaa();
}
class Central1 implements A1,B1
{
	public void aaa()
	{
        //Any Code here
	}
	
	public static void main(String arg[])
	{
        //Statements
	}
}
