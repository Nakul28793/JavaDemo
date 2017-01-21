package JavaInterviewPrograms.AlphabetFrequencyOfString;

public class AlphabetFrequencyString {

	static int i, j, k, c = 0, w;

	static char m; // we can only define static for variables and fns not for
					// arrays

	public static void main(String[] args) {
		System.out.println("Input string is : ");
		System.out.println("Alive is awesome");
		System.out.println("");
		System.out.println("");
		System.out.println("Output :");
		//frequencycount("Alive is awesome");
		//Output :
		//A=1,l=1,i=2,v=1,e=3, =2,s=2,a=1,w=1,o=1,m=1,
		//frequencycount1("arpit Kothari");
		frequencycount1("abac");
	}

	static void frequencycount1(String s)
	{	char[] c=s.toCharArray();
		int sz=c.length;
		int i=0, j=0, counter=0;
		for (i = 0; i < sz; i++)
	    {	
			counter=0;
	        for (j = 0; j < sz; j++)
	        {
	            if(c[j]==c[i] && j<i)
	            {	
	            	break;
	            }
	            if(c[j]==c[i])
	            {		
	            	counter=counter+1;
	            }
	            	
	            if(j==c.length-1)
	            {
	            	//System.out.print(c[i] + "=" + counter + ",");
	            	if(counter==1)
	            	{
	            		System.out.print(c[i] + "=" + counter + ",");
	            	}
	            }
	        }
	        //System.out.println("Duplicate Element is : "+c[i]+" using Brute Force Method and Count :"+counter );
	        
	    }
	}
	
	static void frequencycount(String s)
	{
		char[] z = new char[s.length()];
		for (w = 0; w < s.length(); w++)
			z[w] = s.charAt(w);
		for (i = 0; i < w; i++) 
		{
			char ch = z[i];
			for (j = i + 1; j < w; j++) 
			{
				if (z[j] == ch) 
				{
					for (k = j; k < (w - 1); k++)
					{
						z[k] = z[k + 1];
					}
					w--;
					j = i;
				}
			}
		}

		int[] t = new int[w];
		for (i = 0; i < w; i++) 
		{
			for (j = 0, c = 0; j < s.length(); j++) 
			{
				if (z[i] == s.charAt(j))
				{	
					c++;
				}
			}
			t[i] = c;
			System.out.print(z[i] + "=" + c + ",");
		}
	}
	
}