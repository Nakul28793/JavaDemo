package MethodOverridingWiththrowsClause;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 3) Rule : If super class method is throwing checked type of exception, 
 *           then it can be override in the sub class with same exception or with it’s sub class exceptions i.e you can decrease the scope of the exception, 
 *           or no exception or any other unchecked exceptions or combination of unchecked and checked exception 
 *           but can not be override with it’s super class exceptions i.e you can not increase the scope of the exception.
 *          
 */
class Parent3 {
	void methodOfSuperClass() throws IOException {
		System.out.println("Super class method is throwing Checked Exception");
	}
}

class Child31 extends Parent3 {
	@Override
	// Subclass overridden method declares same exception
	void methodOfSuperClass() throws IOException {
		System.out.println("Can be Override with same Checked Exception");
	}
}

class Child32 extends Parent3 {
	@Override
	void methodOfSuperClass() throws FileNotFoundException {
		System.out.println("Can be Override with Checked Exception with lesser scope");
	}
}

class Child33 extends Parent3 {
	@Override
	// Subclass overridden method declares no exception
	void methodOfSuperClass() {
		System.out.println("Can be Override with no Exceptions");
	}
}

class Child34 extends Parent3 {
	@Override
	void methodOfSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException {
		System.out.println("Can be Override with any Unchecked Exceptions");
	}
}

class Child35 extends Parent3 {
	@Override
	void methodOfSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException, FileNotFoundException {
		System.out.println(
				"Can be Override with any Unchecked Exceptions and Checked Exception with same or lesser scope");
	}
}

class Child36 extends Parent3 {
	@Override
	void methodOfSuperClass() throws Exception {
		// Compile time error
		// Can not be Override with Checked Exception with higher scope
	}
}

public class TestExceptioRule3 {
	public static void main(String args[]) {
		try {
			Parent3 p3 = new Parent3();
			p3.methodOfSuperClass(); // Super class method is throwing Checked Exception

			Child31 c31 = new Child31();
			c31.methodOfSuperClass(); // Can be Override with same Checked Exception
		} catch (IOException i) {
			System.out.println("exception handled");
		}

		try {
			Child32 c32 = new Child32();
			c32.methodOfSuperClass(); // Can be Override with Checked Exception with lesser scope
		} catch (FileNotFoundException f) {
			System.out.println("exception handled");
		}

		Child33 c33 = new Child33();
		c33.methodOfSuperClass(); // Can be Override with no Exceptions
		
		Child34 c34 = new Child34();
		c34.methodOfSuperClass(); // Can be Override with any Unchecked Exceptions

		try {
			Child35 c35 = new Child35();
			c35.methodOfSuperClass(); // Can be Override with any Unchecked Exceptions and Checked Exception with same or lesser scope
		} catch (FileNotFoundException f) {
			System.out.println("exception handled");
		}

		
		try {
			Parent3 pc33 = new Child33();
			pc33.methodOfSuperClass();
		} catch (IOException f) {
			System.out.println("exception handled");
		}
		
		
		try {
			Parent3 pc34 = new Child34();
			pc34.methodOfSuperClass();
		} catch (IOException f) {
			System.out.println("exception handled");
		}
	}
}
