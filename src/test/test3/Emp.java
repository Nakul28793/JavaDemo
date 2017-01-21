package test.test3;

/*
 * Case- 2 Think of a test scenario where you want to store your objects in a HashSet and you want to find a particular object. 
 * First let us see if we do not override the methods and we want to store the objects in the HashSet. 
 * Let us analyze the impact of it from the following code.
 */
public class Emp {
	private int age;

	public Emp(int age) {
		super();
		this.age = age;
	}

	public String toString() {
		return age + "";
	}
}
