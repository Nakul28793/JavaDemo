package test.test4;
/*
 * If you run the above program, the will output will be like the following. 
 * HashSet Size--->>>5 hs.contains( new Emp(3))--->>>false hs.remove( new Emp(2)--->>>false 
 * Now HashSet Size--->>>5 
 * It means that you can not find the object. 
 * However it is not the case for Integer object. 
 * You can put object of type Integer in a HashSet and you can try and you can see the effect. 
 * Now let us modify the �Emp� class so that we will get over the problems what we faced in the above test harness class.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import test.test4.Emp;

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
		
		Iterator<Emp> iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " "); //3 1 1 2 4 ////LinkedHashSet-->1 2 3 4 1
		}
		System.out.println();
		System.out.println("HashSet Size--->>>"+hs.size());  //HashSet Size--->>>5
		System.out.println("hs.contains( new Emp(3))--->>>"+hs.contains(new Emp(3))); //hs.contains( new Emp(3))--->>>false
		System.out.println("hs.remove( new Emp(2)--->>>"+hs.remove( new Emp(2))); //hs.remove( new Emp(2)--->>>false
		System.out.println("Now HashSet Size--->>>"+hs.size()); //Now HashSet Size--->>>5
		
		Iterator<Emp> iterator1 = hs.iterator();
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " "); //3 1 1 2 4 ////LinkedHashSet-->1 2 3 4 1
		}
	}
}
