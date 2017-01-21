package OverrodingIssues;

class MySuper
{
	MySuper()
	{
		disp();
	}
	
	void disp()
	{
		System.out.println("superclass");
	}
}

class MySub extends MySuper
{
	double i=Math.ceil(8.4f);
	
	public static void main(String arg[])
	{
		MySuper obj= new MySuper();           
		System.out.println(obj.getClass());  //class OverrodingIssues.MySuper
		obj.disp();                          //superclass //superclass
		
		MySub obj1= new MySub();
		System.out.println(obj1.getClass());  //class OverrodingIssues.MySub
		obj1.disp();                          //0.0   9.0 
		
		MySuper obj2= new MySub();
		System.out.println(obj2.getClass());  //class OverrodingIssues.MySub
		obj2.disp();                          //0.0   9.0 
	}
	
	void disp()
	{
		System.out.println(i);
	}
}
/*
When we execute the above program JVM checks which class object is holed by the reference variable ‘obj1’ and 'obj2'. 
Now the JVM opens that reference variable and check for disp(). In our example ‘obj1’ and 'obj2' reference variable are holding MySub class object.    
Now the JVM checks disp() is available in MySub class or not. If it is not available then JVM has to checks in the super class of MySub class. 
Now the JVM executes disp() of MySub class.  

The internal code of MySub() calling methodTwo(). 
Now the JVM checks whether methdTwo() is available in the current object or not , 
in our example in current object is Ctwo so the JVM open Ctwo class object and check for methodTwo(). 
If it is available it will execute or it go to super class of Cone and check for methodTwo(). 
*/


/*
superclass
class OverrodingIssues.MySuper
superclass

0.0
class OverrodingIssues.MySub
9.0

0.0
class OverrodingIssues.MySub
9.0
 */