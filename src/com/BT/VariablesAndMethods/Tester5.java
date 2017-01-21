package com.BT.VariablesAndMethods;

public class Tester5 {
	
	public static void print(Integer arg)
	{
		System.out.print("Integer"); //Integer
	}
	public void print(int arg)
	{
		System.out.print("int");
	}
	
	public static void main(String[] args) 
	{
		print(new Integer(3));
	}
}
/*
 * Class Tester has two methods with the name print(), that both accept an Integer argument.

Which one is called in the main()? Is it the static or the non-static print()?

Calling static or non-static members from inside a static block has rules.

You can call a static method inside a static block by either using:

1. no instance of the parent class of the method (if in the same class): print()

2. an instance of the parent class of the method : new Tester().print();

3. the name of the parent class of the method : Tester.print();

But to call a non static method inside a static block you can only do that through an instance of the parent class of the method.

new Tester().print();

In our example , the static method main() is calling directly print() using NO instance of the class Tester, which means main() is calling the static method print().

Quest for all: if we wrote inside main():

new Tester().print(new Integer(3));

What is the output?
*/
