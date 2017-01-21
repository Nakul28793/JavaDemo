package MapDemo.test2;

public class Emp 
{
	private String empName ;
	
	public Emp( String empName )
	{
		super();
		this.empName = empName;
	}
	
	public int hashCode()
	{
		return empName.length();
	}
	
	public boolean equals( Object obj )
	{
		return ((Emp) obj).empName.equals(this.empName);
	}
	
	public String toString() {
		return empName + "";
	}
}
