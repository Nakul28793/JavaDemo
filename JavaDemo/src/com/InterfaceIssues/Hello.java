package com.InterfaceIssues;
/* http://beginnersbook.com/2013/05/java-interface/
 *	9) Interface variables must be initialized at the time of declaration otherwise compiler will through an error.
		interface A
		{
		      int x;//Compile-time error
		}
		Above code will throw a compile time error as the value of the variable x is not initialized at the time of declaration.
 *	15) Variable names conflicts can be resolved by interface name e.g:
 */
interface A2
{
	//int x; //The blank final field x may not have been initialized
	int x=10;
}
interface B2
{
	int x=100;
   //int x=10;
}

class Hello implements A2,B2 
{
	public static void main(String arg[])
    {
		//System.out.println(x); // reference to x is ambiguous both variables are x //The field x is ambiguous
		System.out.println(A2.x);
		System.out.println(B2.x);
    }
}