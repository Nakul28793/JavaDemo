package JavaInterviewPrograms.Reverse;

public class test {

	public static String reverseString(String orignal)
	{	
		String reverse="";
		if(null==orignal || orignal.isEmpty() || orignal.length()<=1)
		{
			return orignal;
		}
		
		for(int i=orignal.length()-1; i>=0;i--)
		{
			reverse=reverse+orignal.charAt(i);
		}
		return reverse;
	}
	
	public static String recursion(String str)
	{
		if(null==str || str.isEmpty() || str.length()<=1)
		{
			return str;
		}
		return recursion(str.substring(1)) + str.charAt(0);
	}
	
	public static String tempArray(String orignal)
	{	
		char[] ch=orignal.toCharArray();
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
	}
	
	public static int reverseNumber(int number)
	{	
		int reminder;
		int reverse=0;
		while(number>0)
		{
			reminder=number%10;
			number=number/10;
			reverse=reverse*10+reminder;
		}
		
		return reverse;
	}
	
	public static void main(String args[])
	{

		String s1="Arpit";
			StringBuffer sb1=new StringBuffer("Arpit");
			System.out.println("StringBuffer-->"+sb1.reverse());
			
			StringBuffer sb2=new StringBuffer(s1);
			System.out.println("StringBuffer-->"+sb2.reverse());
			
			s1=new StringBuffer("tiprA").reverse().toString();
			System.out.println(s1);
			
			s1=new StringBuffer(s1).reverse().toString();
			System.out.println(s1);
			
			System.out.println("");
		
		String s2="Kothari";
			StringBuilder sbb1=new StringBuilder("Kothari");
			System.out.println("StringBuilder-->"+sbb1.reverse());
			
			StringBuilder sbb2=new StringBuilder(s2);
			System.out.println("StringBuilder-->"+sbb2.reverse());
			
			s2=new StringBuffer("irahtoK").reverse().toString();
			System.out.println(s2);
			
			s2=new StringBuffer(s2).reverse().toString();
			System.out.println(s2);
			
			System.out.println("");
			
		String s3="irahtoK tiprA";
			System.out.println(reverseString(s3));
		
			System.out.println("");
		
		String s4="Kothari";
			System.out.println(recursion(s4));
			System.out.println("");
			
		String s5="irahtoK tiprA";
			System.out.println(tempArray(s5));
			System.out.println("");
			
			int i=1236987;
			System.out.println(reverseNumber(i));
			System.out.println("");
		
		
	}

}
