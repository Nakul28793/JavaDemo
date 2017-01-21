package UsingComparatorInterfaceInJava.SortingAnCollectionOfJavaObjectsUsingComparatorInterface;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		return (emp1.getEmpId() < emp2.getEmpId()) ? -1 : (emp1.getEmpId() > emp2.getEmpId()) ? 1 : 0;

	}

}