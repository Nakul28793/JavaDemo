package finalKeywordDemo;

class A {
	int i = 10;
}

public class UseOfFinalKeyword {
	public static void main(String[] args) {
		final A a = new A(); // final reference variable
		a.i = 50;
		a.i = 60;
		System.out.println(a.i); //60
		// you can change the state of an object to which final reference
		// variable is pointing
		a = new A(); // compile time error
		// you can't re-assign a new object to final reference variable
	}
}