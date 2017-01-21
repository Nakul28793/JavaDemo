package MapDemo.test1;

public class Emp 
{
	private String empName ;
	
	public Emp( String empName )
	{
		super();
		this.empName = empName;
	}
	
	//no hashCode() method
	 
    //no equals() method
	
	public String toString() {
		return empName + "";
	}
}
