package com.BT.Exceptions;
/*
 * 	Implicit call to super() will be called, print Father, then throws a RuntimeException. 
	The remaining of the code in Son constructor won't be continued.
	
	RuntimeException is an unchecked exception which means Son() although that it explicitly declares to throw a RuntimeException, 
	no handling is required
 */
class Father2 {
	public Father2() throws RuntimeException {
		System.out.println("Father");
		throw new RuntimeException();
	}
}
class Son2 extends Father2 {
	public Son2() throws RuntimeException {
		System.out.println("Son");
	}
}
public class Tester2 {
	public static void main(String[] args) {
			new Son2(); // line 17
	}
}
/*
Father
Exception in thread "main" java.lang.RuntimeException
	at com.BT.Exceptions.Father1.<init>(Tester1.java:6)
	at com.BT.Exceptions.Son1.<init>(Tester1.java:10)
	at com.BT.Exceptions.Tester1.main(Tester1.java:16)
*/