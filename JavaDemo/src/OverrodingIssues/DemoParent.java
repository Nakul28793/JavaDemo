package OverrodingIssues;

class DemoBase
{
	Object  m1()
	{
		System.out.println("DemoBase");
		return 0;
	}
}


public class DemoParent extends DemoBase
{
	String m1()
	{
		System.out.println("DemoParent");
		return "arpit";
	}
	public static void main(String args[])
	{
		//DemoBase db=new DemoBase();
		//db.m1(); //DemoBase
		
		DemoParent dp=new DemoParent();
		dp.m1(); //DemoParent
		
		DemoBase dbp=new DemoParent();
		dbp.m1(); //DemoParent
		
		DemoParent dpdbsolution=(DemoParent)new DemoBase();
		dpdbsolution.m1();
		
		//DemoParent dpdb=new DemoBase();
		//dpdb.m1();
	}
}
