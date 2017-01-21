package MapDemo.test2;
import java.util.HashMap;
import java.util.Map.Entry;

import MapDemo.test2.Emp;
/*
 * 	4
	Vivek - 15
	Arpit - 18
	Piyush - 5
	Priyanka - 20
 */
public class TestEmp {
	public static void main(String[] args) 
	{
		Emp emp1 = new Emp("Arpit");
		Emp emp2 = new Emp("Vivek");
		Emp emp3 = new Emp("Piyush");
		Emp emp4 = new Emp("Priyanka");
		Emp emp5 = new Emp("Arpit");
		
		HashMap<Emp, Integer> hashMap = new HashMap<Emp, Integer>();
		hashMap.put(emp1,10);
		hashMap.put(emp2,15);
		hashMap.put(emp3,5);
		hashMap.put(emp4,20);
		hashMap.put(emp5,18);
		
		System.out.println(hashMap.get(new Emp("Arpit"))); //18
		System.out.println(hashMap.size());
		for (Entry<Emp, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
		
	}
}
