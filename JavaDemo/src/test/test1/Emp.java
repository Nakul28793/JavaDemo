package test.test1;
/*
 * Case-1: You can override the hashCode method in your own way.
 * In the below example class “Emp” the variable age is the significant factor. 
 * Here the hashCode value will return the age of the employee
 */
public class Emp {
	private int age;

	public Emp(int age) {
		super();
		this.age = age;
	}

	public int hashCode() {
		return age;
	}
}