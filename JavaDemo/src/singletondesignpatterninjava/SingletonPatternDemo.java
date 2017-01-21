package singletondesignpatterninjava;

public class SingletonPatternDemo 
{
	public static void main( String[] args )
	{
		Singleton.getSingletonInstance().printSingleton();
		Singleton.getSingletonInstance().printSingleton();
		Singleton.getSingletonInstance().printSingleton(); 
		
		Singleton s1=Singleton.getSingletonInstance();
		Singleton s2=Singleton.getSingletonInstance();
		s1.marks = 50;
		s2.marks = 60;
	    System.out.println("std1 marks when std2 changes: " + s1.marks);   // 60
	 
		s1.marks = 70;
		System.out.println("std2 marks when std1 changes: " + s2.marks);    // 70
		 
		System.out.println("\nstd1 hash code: " + s1.hashCode());
		System.out.println(  "std2 hash code: " + s2.hashCode());
	}
}
