package UsingComparableInterfaceInJava.SortingAnAarrayOfJavaClassObjectsUsingComparable;

import java.util.Arrays;

public class Implementation {

	public static void main(String args[]) {

		Employee employee1 = new Employee(2, "Zinger");
		Employee employee2 = new Employee(4, "Jolly");
		Employee employee3 = new Employee(1, "Sanorita");
		Employee employee4 = new Employee(3, "Andrew");

		Employee empArray[] = { employee1, employee2, employee3, employee4 };

		System.out.println("EmpArray elemnets befor sorting by id :");
		for (int i = 0; i < empArray.length; i++) {
			System.out.println("EmpId: " + empArray[i].getEmpId() + " | EmpName: " + empArray[i].getEmpName());
		}

		Arrays.sort(empArray);

		System.out.println("EmpArray elemnets after sorting by id :");
		for (int i = 0; i < empArray.length; i++) {
			System.out.println("EmpId: " + empArray[i].getEmpId() + " | EmpName: " + empArray[i].getEmpName());
		}
	}
}