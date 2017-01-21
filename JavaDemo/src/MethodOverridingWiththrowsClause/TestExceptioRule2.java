package MethodOverridingWiththrowsClause;

import java.io.FileNotFoundException;

/*
 * 2) Rule : If a super class method is throwing unchecked type of exception, 
 * 			 then it can be override in the sub class with same exception or no exception 
 * 			 or any other unchecked exceptions(with it’s sub class exception i.e you can decrease the scope of the exception) 
 * 			 but can not be override with checked exceptions..
 *           
 *           Note: but can be override with it’s super class exceptions i.e you can increase the scope of the exception.
 *                   
 *          RuntimeException
				IndexOutOfBoundsException
      				ArrayIndexOutOfBoundsException
      				StringIndexOutOfBoundsException
 */
class Parent2 {
	void methodOfSuperClass() throws IndexOutOfBoundsException {
		System.out.println("Super class method is throwing Unchecked exception");
	}
}

class Child21 extends Parent2 {
	@Override
	//Subclass overridden method declares same exception
	void methodOfSuperClass() throws IndexOutOfBoundsException {
		System.out.println("Can be Override with same Unchecked exception");
	}
}

class Child22 extends Parent2 {
	@Override
	void methodOfSuperClass() throws ArrayIndexOutOfBoundsException {
		System.out.println("Can be Override with Unchecked Exception with lesser scope");
	}
}

class Child23 extends Parent2 {
	void methodOfSuperClass() throws StringIndexOutOfBoundsException {
		System.out.println("Can be Override with Unchecked Exception with lesser scope");
	}
}

class Child24 extends Parent2 {
	@Override
	//Subclass overridden method declares no exception
	void methodOfSuperClass() {
		System.out.println("Can be Override with no Exceptions");
	}
}

class Child25 extends Parent2 {
	@Override
	void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException {
		System.out.println("Can be Override with any number or any other Unchecked Exceptions");
	}
}

class Child26 extends Parent2 {
	@Override
	void methodOfSuperClass() throws RuntimeException {
		System.out.println("Can be Override with any other Unchecked Exceptions");
	}
}

class Child27 extends Parent2 {
	@Override
	void methodOfSuperClass() throws IOException {
		// Compile time error
		// Can not be override with Checked Exception
	}
}

public class TestExceptioRule2 {
	public static void main(String args[]) {
		Parent2 p2 = new Parent2();
		p2.methodOfSuperClass(); //Super class method is throwing Unchecked exception

		Child21 c21 = new Child21();
		c21.methodOfSuperClass(); //Can be Override with same Unchecked exception

		Child22 c22 = new Child22();
		c22.methodOfSuperClass(); //Can be Override with Unchecked Exception with lesser scope
		
		Child23 c23 = new Child23();
		c23.methodOfSuperClass(); //Can be Override with Unchecked Exception with lesser scope

		Child24 c24 = new Child24();
		c24.methodOfSuperClass(); //Can be Override with no Exceptions
		
		Child25 c25 = new Child25();
		c25.methodOfSuperClass(); //Can be Override with any number or any other Unchecked Exceptions

		Child26 c26 = new Child26();
		c26.methodOfSuperClass(); //Can be Override with any other Unchecked Exceptions


		
		
		
		

		Parent2 p2c21 = new Child21();
		p2c21.methodOfSuperClass(); //Can be Override with same Unchecked exception

		Parent2 p2c22 = new Child22();
		p2c22.methodOfSuperClass(); //Can be Override with Unchecked Exception with lesser scope
		
		Parent2 p2c23 = new Child23();
		p2c23.methodOfSuperClass(); //Can be Override with Unchecked Exception with lesser scope

		Parent2 p2c24 = new Child24();
		p2c24.methodOfSuperClass(); //Can be Override with no Exceptions
		
		Parent2 p2c25 = new Child25();
		p2c25.methodOfSuperClass(); //Can be Override with any number or any other Unchecked Exceptions

		Parent2 p2c26 = new Child26();
		p2c26.methodOfSuperClass(); //Can be Override with any other Unchecked Exceptions

	}
}
