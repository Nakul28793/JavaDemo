package UsingComparableInterfaceInJava.SortingAnAarrayOfJavaClassObjectsUsingComparable;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;

	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public int compareTo(Employee emp) {
		//ascending order
		return (this.empId < emp.empId) ? -1 : (this.empId > emp.empId) ? 1 : 0;
		//   OR
		
		//ascending order
		//return this.empId - emp.empId;
		 
		//descending order
		//return emp.empId - this.empId;
		 
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