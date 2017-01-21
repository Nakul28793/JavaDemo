package test.test1;
/*
 * If you run the below program, the output will be the age what you have given i.e. 23. 
 * Now question arises whether there is any way we can get the original hashCode(). 
 * We can say that if we do not override the hashCode() method what could have been the hashCode of this object. 
 * However please do not feel depressed, Java provide another approach even if you have overridden the hashCode() method , 
 * still you can get the original hashCode of a particular class. 
 * 
 */
public class TestEmp {
	public static void main(String[] args) {
		Emp emp1 = new Emp(23);
		System.out.println("emp1.hashCode()--->>>" + emp1.hashCode());
	}
}
