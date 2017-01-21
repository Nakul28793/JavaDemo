package JavaInterviewPrograms.PrimeNumber;
/*http://www.javamadesoeasy.com/2015/02/prime-number.html
 * Program: Write a program to check the given number is a prime number or not?
- See more at: http://www.java2novice.com/java-interview-programs/is-prime-number/#sthash.ilUgGevH.dpuf

What is prime number?
	A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

I have seen at many places iteration starting from i=2 to i<=n/2 which offers time complexity of O(n/2).
But, we will start iterating from i=2 to i<=Math.sqrt(n).

Q. why i<=Math.sqrt(n)? 
	A.It will help us in reducing time complexity from O(n/2) to O(√ N).
	
	
n	When, i=2 to i<=Math.sqrt(n).			When, ii=2 to i<=n/2
	Time complexity = O(√ N )  				Time complexity = O( n/2 )
11	i=2 to i<=3 [max two executions]		i=2 to i<=5 [max 4 execution]
21	i=2 to i<=4 [max three executions]		i=2 to i<=10 [max 9 execution]
	GOOD Performance.						POOR performance.	
 
 */
public class PrimeNumberCheck {
	public static boolean isPrimeNumber(int number)
	{   
		int temp;
		
		if (number <= 1) 
		{
	           return false;
	    }
		
		//for(int i=2; i<number; i++)
		//OR
		for(int i=2; i<=number/2; i++)
		//OR
		//for(int i=2;i<=Math.sqrt(number);i++)
		{   
			temp=number % i;
			System.out.println("temp-->"+temp +" "+ "i-->"+i);
			if(temp== 0)
			{
				return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
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
