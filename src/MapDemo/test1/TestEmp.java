package MapDemo.test1;
import java.util.HashMap;
import java.util.Map.Entry;
/*
 * 	5
	Piyush - 5
	Arpit - 18
	Arpit - 10
	Vivek - 15
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
		
		System.out.println("HashMap's data-> "+hashMap);
        System.out.println("HashMap's size-> "+hashMap.size());
		System.out.println(hashMap.get(new Emp("Arpit"))); //null
		
		for (Entry<Emp, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
		
	}
}
