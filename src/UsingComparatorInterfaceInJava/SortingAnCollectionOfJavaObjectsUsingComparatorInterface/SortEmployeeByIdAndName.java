package UsingComparatorInterfaceInJava.SortingAnCollectionOfJavaObjectsUsingComparatorInterface;

import java.util.Comparator;

public class SortEmployeeByIdAndName implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		int flag = (emp1.getEmpId() - emp2.getEmpId());
		if (flag == 0) {
			flag = (emp1.getEmpName().compareTo(emp2.getEmpName()));
		}
		return flag;

	}

}
