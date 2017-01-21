package UsingComparableInterfaceInJava.SortingAnCollectionOfJavaObjectsUsingComparable;
/*
 * Pay attention to the type of empId in class Employee, 
 * it is the primitve type "int", and you cannot invoke method compareTo on a primitive type, 
 * this causes a compilation error.
 */
public class Employee implements Comparable<Employee> {

	private int empId;
	//private Integer empId;
	private String empName;

	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public int compareTo(Employee emp) {
		//ascending order
		//return (this.empId < emp.empId) ? -1 : (this.empId > emp.empId) ? 1 : 0;
		//return this.empId - emp.empId;
		//return (this.empName.compareTo(emp.empName));
		int flag = (this.empId < emp.empId) ? -1 : (this.empId > emp.empId) ? 1 : 0;
		if (flag == 0) 
		{
			flag = (this.empName.compareTo(emp.empName));
		}
		return flag;
		
		/*int nameDiff = (this.empName.compareToIgnoreCase(emp.empName));
        if(nameDiff != 0){
            return nameDiff;
        }
        return this.empId - emp.empId;*/
		
		
		//descending order
		//return (emp.empId<this.empId) ? -1 : (emp.empId > this.empId) ? 1 : 0;
		//return emp.empId - this.empId;
		//return (emp.empName.compareTo(this.empName));
		
		/*int flag = (emp.empId<this.empId) ? -1 : (emp.empId > this.empId) ? 1 : 0;
		if (flag == 0) 
		{
			flag = (emp.empName.compareTo(this.empName));
		}
		return flag;*/
		 
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