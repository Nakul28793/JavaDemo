package JavaInterviewPrograms.Reverse;
/*
 * http://javahungry.blogspot.com/2014/12/5-ways-to-reverse-string-in-java-with-example.html
 * 
 * Points to Keep in Mind Before attempting the Solution:
	1. String class in java do not have reverse() method , StringBuilder class does have built in reverse() method.
	2. StringBuilder class do not have toCharArray() method , while String class does have toCharArray() method.
 */
public class ReverseString 
{
	public static void main(String args[])
	{
		//original string
		String original="My Name Is Arpit";
		System.out.println("Original String: " + original);
		String reverse = "";

		//StringBuffer a = new StringBuffer("My Name Is Arpit");
				//OR
		StringBuffer a = new StringBuffer(original);
	    System.out.println("Reverse of entered string is: "+a.reverse());
	    System.out.println("\n");
	    
	    //reversed string using StringBuffer
	    reverse = new StringBuffer(original).reverse().toString();
	    System.out.println("Reverse String in Java using StringBuffer:"+reverse);
	    System.out.printf("Original String : %s , Reversed String : %s  %n", original, reverse);
	    System.out.println("\n");
	    
	    //another quick to reverse String in Java - use StringBuilder
        reverse = new StringBuilder(original).reverse().toString();
        System.out.println("Reverse String in Java using StringBuilder:"+reverse);
        System.out.printf("Original String : %s , Reversed String : %s %n", original, reverse);
        System.out.println("\n");
  
        //iterative method to reverse String in Java
        reverse = reverse(original);
        System.out.println("Reverse String in Java using Iteration: " + reverse);
        System.out.printf("Original String : %s , Reversed String : %s %n", original, reverse);
        System.out.println("\n");
        
        //CharArray to reverse String in Java
        reverse = reverseCharArray(original);
        System.out.println("Reverse String in Java using CharArray: " + reverse);
        System.out.printf("Original String : %s , Reversed String : %s %n", original, reverse);
        System.out.println("\n");
        
        //recursive method to reverse String in Java
        reverse = reverseRecursively(original);
        System.out.println("Reverse String in Java using Recursion: " + reverse);
        System.out.printf("Original String : %s , Reversed String : %s %n", original, reverse);
        



	}
	
	public static String reverse(String source)
	{
		if(null==source || source.isEmpty() || source.length() <= 1)
        {
            return source;
        }      
        
		String reverse = "";
        
		for(int i = source.length() -1; i>=0; i--)
        {
            reverse = reverse + source.charAt(i);
        }
     
        return reverse;
    }
	
	public static String reverseCharArray(String str) 
	{//http://www.javamadesoeasy.com/2015/02/reverse-string-keeping-performance-in.html
		if ((null == str) || str.isEmpty() || (str.length() <= 1))
		{
			return str;
		}
		
		char[] ch=str.toCharArray();
		char temp;
		int i,begin,end,middle;
		begin=0;
		end=ch.length-1;
		middle=(begin+end)/2;
		for(i=begin;i<=middle;i++)
		{
			temp=ch[begin];
			ch[begin]=ch[end];
			ch[end]=temp;
			
			begin++;
			end--;
		}
		
		return new String(ch);
	
		
		/*char[] chars = str.toCharArray();
		int length = chars.length - 1;
		for (int i = 0; i < length; i++) 
		{
			char tempVar = chars[i];
			chars[i] = chars[length];
			chars[length--] = tempVar;
		}
		return new String(chars);
		*/
		
		/*char[] temparray= str.toCharArray();
		char temp; 
	   
	    //for (int left=0, right=temparray.length-1; left < right ; left++ ,right--)
	    for (int left=0, right=temparray.length-1; left < (temparray.length/2) ; left++ ,right--)	
	    {
	    	temp = temparray[left];
	    	temparray[left] = temparray[right];
	    	temparray[right]=temp;
	    }
	    
	   return new String(temparray);*/
		
		  
		    
		
		
		/*char ch[]=new char[str.length()];
        for(int i=0;i < str.length();i++)
        {	
        	ch[i]=str.charAt(i);
        }
        for(int i=str.length()-1;i>=0;i--)
        {	
        	System.out.print(ch[i]);
        }
        return new String(ch);*/
	}

	public static String reverseRecursively(String str) 
	{
		//base case to handle one char string and empty string
		if ( null==str || str.isEmpty() || str.length() <= 1) 
		{
		    return str;
		}
		
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}

}
