package staticKeywordDemo;

public class A2 {

	static {
		System.out.println("static block is invoked");
		A2 a=new A2();
		a.m1();
		//return; //Initializers should not return the control
	}
	
	public void m1()
    {      
    	System.out.println("String version");
    }
	
	public static void main(String args[]) {
		System.out.println("Hello main");
	}
}
