package test.test3;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class TestEmp {
	public static void main(String[] args) 
	{
		Emp emp1 = new Emp(1);
		Emp emp2 = new Emp(2);
		Emp emp3 = new Emp(3);
		Emp emp4 = new Emp(4);
		Emp emp5 = new Emp(1);
		
		HashSet<Emp> hs = new HashSet<Emp>();
		//LinkedHashSet<Emp> hs = new LinkedHashSet<Emp>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		
		System.out.println("HashSet Size--->>>"+hs.size());  //HashSet Size--->>>5
		System.out.println("hs.contains( new Emp(3))--->>>"+hs.contains(new Emp(3))); //hs.contains( new Emp(3))--->>>false
		System.out.println("hs.remove( new Emp(2)--->>>"+hs.remove( new Emp(2))); //hs.remove( new Emp(2)--->>>false
		System.out.println("Now HashSet Size--->>>"+hs.size()); //Now HashSet Size--->>>5
		
		Iterator<Emp> iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " "); //3 1 1 2 4  //LinkedHashSet-->1 2 3 4 1 
		}
	}
}
