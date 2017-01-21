package OverrodingIssues;

class Base 
{
	public int getNext(int i)
	{
		return ++i;
	}
	
	public final int getNext1(int i)
	{
		return ++i;
	}
}

public class Derived extends Base 
{
	public final int getNext(int i) 
	{
		return i++;
	}
	
	public int getNext1(int i)
	{
		return ++i;
	}

	public static void main(String[] args) 
	{

		int result = new Derived().getNext(3);
		
		System.out.print(result); //3

		result = new Base().getNext(3);

		System.out.print(result); //4
	}
}
