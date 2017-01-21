package singletondesignpatterninjava;
/*
 * http://way2java.com/design-patterns/java-singleton-pattern/
 * First  Condition: If we are     implemented Cloneable interface==Allow     To Create Clone Of Objects
 * Second Condition: If we are not implemented Cloneable interface==Not Allow To Create Clone Of Objects
 * Third  Condition: If we are not implemented Cloneable interface but write public Object clone() throws CloneNotSupportedException method==Not Allow To Create Clone Of Objects
 * Forth  Condition: If we are     implemented Cloneable interface And write public Object clone() throws CloneNotSupportedException method==Not Allow To Create Clone Of Objects
 */
public class Student 
{ 
	private int marks; // assigned with default 0 
	private static Student std; // assigned with default null   
	private Student() 
	{ 
		// some code if required 
	} 
	
	public static synchronized Student getMe() 
	{ 
		if(std == null) 
		{ 
			std = new Student(); 
		} 
		return std; 
	}   
	
	public Object clone() throws CloneNotSupportedException 
	{ 
		System.out.println("Hi Arpit You Are In Clone Method");
		throw new CloneNotSupportedException("Not allowed on this singleton object"); 
	}
	
	public static void main(String args[]) 
	{ 
		Student std1 = getMe(); 
		Student std2 = getMe();   
		std1.marks = 50; 
		std2.marks = 60; 
		System.out.println("std1 marks when std2 changes: " + std1.marks); // 60   
		/*if we are not using public Object clone() throws CloneNotSupportedException method then we can create clone of Student object  See try catch block*/
		try
		{
			Student std3 = (Student)std1.clone();
			std3.marks = 100; 
			System.out.println("std3: " + std3.marks); // 60 
			System.out.println("std3 hash code: " + std3.hashCode());
		}
		catch(CloneNotSupportedException c)
		{
			System.out.println("Hi Arpit You Are In Catch Block");
		}
		////////////////
		std1.marks = 70; 
		System.out.println("std2 marks when std1 changes: " + std2.marks); // 70   
		System.out.println("\nstd1 hash code: " + std1.hashCode()); 
		System.out.println("std2 hash code: " + std2.hashCode());
		
		
		
		 
	} 
}

