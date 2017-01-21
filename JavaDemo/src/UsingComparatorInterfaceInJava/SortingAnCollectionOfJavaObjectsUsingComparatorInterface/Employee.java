package UsingComparatorInterfaceInJava.SortingAnCollectionOfJavaObjectsUsingComparatorInterface;
/*
 * Employee.java - No need to implement any interface itself
 */
public class Employee {

	private int empId;
	private String empName;

	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
