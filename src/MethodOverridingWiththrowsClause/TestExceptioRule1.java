package MethodOverridingWiththrowsClause;

/*
 * 1) Rule : If super class method is not throwing any type of exceptions, 
 *           then it can be override in the sub class with any unchecked type of exceptions, 
 *           but can not be override with checked type of exceptions.
 *           
 */
class Parent1 {
	void methodOfSuperClass() {
		System.out.println("Super class method is not throwing any exceptions");
	}
}

class Child11 extends Parent1 {
	@Override
	void methodOfSuperClass() throws ArrayIndexOutOfBoundsException {
		System.out.println("Can be Override with any Unchecked Exception");
	}
}

class Child12 extends Parent1 {
	@Override
	void methodOfSuperClass() throws RuntimeException, NumberFormatException, NullPointerException  {
		System.out.println("Can be Override with any number of Unchecked Exceptions");
	}
}

class Child13 extends Parent1 {
	 @Override
	 void methodOfSuperClass() throws SQLException {
		 // Compile time error
		 // Can not be Override with Checked Exception
	 }
}

public class TestExceptioRule1 {

	public static void main(String args[]) {
		Parent1 supc = new Parent1();
		supc.methodOfSuperClass(); //Super class method is not throwing any exceptions

		Child11 subc = new Child11();
		subc.methodOfSuperClass(); //Can be Override with any Unchecked Exception

		Child12 subco = new Child12();
		subco.methodOfSuperClass(); //Can be Override with any number of Unchecked Exceptions

		Parent1 supSubc = new Child11();
		supSubc.methodOfSuperClass(); //Can be Override with any Unchecked Exception

		Parent1 supcSubco = new Child12();
		supcSubco.methodOfSuperClass(); //Can be Override with any number of Unchecked Exceptions

	}
}
