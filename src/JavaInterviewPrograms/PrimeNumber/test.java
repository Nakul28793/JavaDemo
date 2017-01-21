package JavaInterviewPrograms.PrimeNumber;

public class test {
	
	public static boolean isPrimeNumber(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String args[])
	{
    	int n=1;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
        n=-11;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
    	n=11;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
        n=12;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
        n=13;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
        n=14;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
        
        n=15;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
        n=17;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
        n=19;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
        
        n=21;
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
	}
	
}
