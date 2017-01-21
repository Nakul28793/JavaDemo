package test.test2;
/*
 * So then why it is necessary to override this method. 
 * There is one reason that if want to compare two objects based upon the equals() method. 
 * Although in a very simple class like “Emp”, you can achieve without overriding hashCode() method. 
 * But if you do this , you are going to violate the contract for the methods hashCode() and hashCode() of the object class.
 * The similar case is for the method equals(). 
 * So functional point is that if want to compare two objects based upon the equals() method you have to override both hashCode() and equals() methods. 
 * Please have look into the Emp class with the overridden methods and the related test harness class.
 */
public class TestEmp {
	public static void main(String[] args) {
		Emp emp1 = new Emp(23);
		Emp emp2 = new Emp(23);
		System.out.println("emp1.equals(emp2)--->>>" + emp1.equals(emp2));
	}
}
