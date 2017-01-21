package OverrodingIssues;
/*
 * Method overriding is the example of run time Polymorphism.
 * Return type must be same or Covariant in method overriding
 * 
 * Imp-->Also note that overriding method can not reduce the access scope of overridden method. 
 * Put in simple words, if overridden method in parent class is protected, then overriding method in child class can not be private. 
 * It must be either protected (same access) or public (wider access).
 * Rule #5: The overriding method must not have more restrictive access modifier.
 * 
 Q : Can we override private method in java
 Ans: 	We can not override private methods in java.
		lets see what will happen if we try to override a method of super class?
		Sorry if we are unable to access super class private methods then there should not be a questions of overriding that method right?
		Yes private methods of super class can not be overridden in sub class.
		Even if we try to override same method of super class that will became a sub class own method not overridden method.
 */
class Baseclass
{
//super class public m1 method
		public void m1()
		{
			System.out.println("Super class method m1");
		}

//super class protected m2 method
		protected void m2()
		{
			System.out.println("Super class method m2");
		}

//super class default m3 method
		void m3()
		{
			System.out.println("Super class method m3");
		}

//super class private m4 method
		private void m4()
		{
			System.out.println("Super class method m4");
		}
		

}

public class OverridingDemo extends Baseclass 
{
//If not provide proper allowed modifiers it leads compiler error 
//cannot reduce the visibility of the inherited method from super class

//super class public m1 method allowed modifiers public only
	public void m1()
	{
		System.out.println("Sub class method m1");
	}

//super class protected m2 method protected,public
	protected void m2()
	{
		System.out.println("Sub class method m2");
	}

//sub class default m3 method allowed default,protected,public    
	void m3()
	{
		System.out.println("Sub class method m3");
	}
	
//sub class private m4 method allowed private,default,protected,public    
	private void m4()
	{
		System.out.println("Sub class method m4");
	}
	
	public static void main(String[] args) 
	{
		Baseclass bc=new Baseclass();
		bc.m1();
		bc.m2();
		bc.m3();
		//bc.m4(); //The method m4() from the type Baseclass is not visible
		
		OverridingDemo  s=new OverridingDemo();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		
		Baseclass bCOD=new OverridingDemo();
		bCOD.m1();
		bCOD.m2();
		bCOD.m3();
		//bCOD.m4(); //The method m4() from the type Baseclass is not visible
		
		//OverridingDemo od= new Baseclass(); //Type mismatch: cannot convert from Baseclass to OverridingDemo
		
		OverridingDemo od= (OverridingDemo)new Baseclass();
		od.m1();
		od.m2();
		od.m3();
		od.m4();
		
		
	}
}

