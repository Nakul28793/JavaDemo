package UsingComparatorInterfaceInJava.SortingAnCollectionOfJavaObjectsUsingComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Implementation {
	public static void main(String args[]) {

		Employee employee1 = new Employee(2, "Zinger");
		Employee employee2 = new Employee(1, "Sanorita");
		Employee employee3 = new Employee(1, "Jolly");
		Employee employee4 = new Employee(3, "Andrew");

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);

		System.out.println("EmpList elemnets befor sorting :");

		for (int i = 0; i < empList.size(); i++) {
			System.out.println("EmpId: " + empList.get(i).getEmpId() + " | EmpName: " + empList.get(i).getEmpName());
		}

		Collections.sort(empList, new SortEmployeeById());

		System.out.println("EmpList elemnets after sorting by id :");

		for (int i = 0; i < empList.size(); i++) {
			System.out.println("EmpId: " + empList.get(i).getEmpId() + " | EmpName: " + empList.get(i).getEmpName());
		}

		Collections.sort(empList, new SortEmployeeByName());

		System.out.println("EmpList elemnets after sorting by name :");
		for (int i = 0; i < empList.size(); i++) {
			System.out.println("EmpId: " + empList.get(i).getEmpId() + " | EmpName: " + empList.get(i).getEmpName());
		}

		Employee employee5 = new Employee(1, "Arpit");
		empList.add(employee5);

		Collections.sort(empList, new SortEmployeeByIdAndName());

		System.out.println("EmpList elemnets after sorting by id and name :");
		for (int i = 0; i < empList.size(); i++) {
			System.out.println("EmpId: " + empList.get(i).getEmpId() + " | EmpName: " + empList.get(i).getEmpName());
		}

	}
}