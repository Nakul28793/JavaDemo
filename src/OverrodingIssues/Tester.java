package OverrodingIssues;
/*
 * Imp-->The return type of overriding method can be child class of return type declared in overridden method.
 * Rule #4: The overriding method must have same return type (or subtype).
 */
class Type 
{
	public Object getTypeName()
	{
		return "Type";
	}
	
	int method()
    {
        return 0;
    }

}

class SubType extends Type 
{
	public String getTypeName()
	{
		return "SubType";
	}
	
	@Override
    Integer method()
    {
        return 10;  // No, return type of the overridden method is incompatible with it’s super class method.
    }
}

public class Tester 
{
	public static void main(String[] args) 
	{
		Type first = new SubType(); 
		
		System.out.println(first.getTypeName()); //SubType
	}
}