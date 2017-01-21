package test.test1;
/*
 * Here the output will be like this Overridden hashCode()--->>>23 Original hashCode of Emp---->>>8567361 
 * As you know the above number is arbitrary, it depends upon your system. 
 */
public class TestEmp1 {
	public static void main(String[] args) {
		Emp emp1 = new Emp(23);
		System.out.println("Overridden hashCode()--->>>" + emp1.hashCode());
		int originalHashCode = System.identityHashCode(emp1);
		System.out.println("Original hashCode of Emp---->>>" + originalHashCode);
	}
}
