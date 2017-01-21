public class TigerCisco implements Cloneable
{
	private String color;
	private String stripePattern;
	
	@Override
	public boolean equals(Object object) 
	{
		boolean result = false;
		if (object == null || object.getClass() != getClass()) 
		{
			result = false;
		} 
		else 
		{
			TigerCisco tiger = (TigerCisco) object;
			if (this.color == tiger.getColor() && this.stripePattern == tiger.getStripePattern()) 
			{
				result = true;
			}
		}
		return result;
	}

	@Override
	public int hashCode() 
	{
		int hash = 3;
		hash = 7 * hash + this.color.hashCode();
		hash = 7 * hash + this.stripePattern.hashCode();
		return hash;
	}

	public static void main(String args[]) 
	{
		try
		{
			TigerCisco bengalTiger1 = new TigerCisco("Yellow", "Dense");
			
			TigerCisco bengalTiger2 = (TigerCisco)bengalTiger1.clone();
			System.out.println(bengalTiger1.color+" "+bengalTiger1.stripePattern);  
			System.out.println(bengalTiger2.color+" "+bengalTiger2.stripePattern); 
			
			System.out.println("bengalTiger1 and bengalTiger2: "+ bengalTiger1.equals(bengalTiger2));
			
			System.out.println(bengalTiger1==bengalTiger2);
			System.out.println(bengalTiger1.hashCode());
			System.out.println(bengalTiger2.hashCode());
			
			bengalTiger2.color="White";
			bengalTiger2.stripePattern="Dense";
			System.out.println("\n");
			System.out.println("bengalTiger1 and bengalTiger2: "+ bengalTiger1.equals(bengalTiger2));
			System.out.println(bengalTiger1==bengalTiger2);
			System.out.println(bengalTiger1.hashCode());
			System.out.println(bengalTiger2.hashCode());

		}
		catch(CloneNotSupportedException c)
		{
			
		}
		  
		 
	}

	public String getColor() 
	{
		return color;
	}

	public String getStripePattern() 
	{
		return stripePattern;
	}
	
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
	} 

	public TigerCisco(String color, String stripePattern) {
		this.color = color;
		this.stripePattern = stripePattern;
	}
}
