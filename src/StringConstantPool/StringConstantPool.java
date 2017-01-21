package StringConstantPool;
public class StringConstantPool {
	public static void main(String[] args) {
		
		//String str1 = "Hello";  
	    String str2 = "Hello"; 
	    String str3 = "Hello";
	    
	    String str1 = new String("Hello");  
	    /*String str2 = new String("Hello");
	    String str3 = new String("Hello");
	    
	    str1=str2;
	    str2=str3;
	    str3=str1;*/
	    
	    System.out.println("str1 and str2 are created by using string literal.");    
	    System.out.println("    str1 == str2 is " + (str1 == str2));  
	    System.out.println("    str1.equals(str2) is " + str1.equals(str2));  

	    System.out.println("str2 and str3 are created by using string literal.");    
	    System.out.println("    str2 == str3 is " + (str2 == str3));  
	    System.out.println("    str2.equals(str3) is " + str2.equals(str3)); 
	    
	    System.out.println("str3 and str1 are created by using string literal.");    
	    System.out.println("    str3 == str1 is " + (str3 == str1));  
	    System.out.println("    str3.equals(str1) is " + str3.equals(str1));
	    
	    System.out.println("    hashcode of str1 is " + str1.hashCode());
	    System.out.println("    hashcode of str2 is " + str2.hashCode());
	    System.out.println("    hashcode of str3 is " + str3.hashCode());
	    
	    /*String str3 = new String("Hello");  
	    String str4 = new String("Hello"); 
	    System.out.println("str3 and str4 are created by using new operator.");    
	    System.out.println("    str3 == str4 is " + (str3 == str4));  
	    System.out.println("    str3.equals(str4) is " + str3.equals(str4));  
	    
	    String str5 = "Hel"+ "lo";  
	    String str6 = "He" + "llo"; 
	    System.out.println("str5 and str6 are created by using string constant expression.");    
	    System.out.println("    str5 == str6 is " + (str5 == str6));  
	    System.out.println("    str5.equals(str6) is " + str5.equals(str6));

	    String s = "lo";
	    String str7 = "Hel"+ s;  
	    String str8 = "He" + "llo"; 
	    System.out.println("str7 is computed at runtime.");		
	    System.out.println("str8 is created by using string constant expression.");    
	    System.out.println("    str7 == str8 is " + (str7 == str8));  
	    System.out.println("    str7.equals(str8) is " + str7.equals(str8));
	    
	    
	    
	    String a="Arpit";
	    String ab=a+"Kothari";
	    String abc="ArpitKothari";
	    System.out.println("a is created by using string literal.");
	    System.out.println("ab is created by using string constant expression.");    
	    System.out.println("    ab == abc is " + (ab == abc));  //false
	    System.out.println("    ab.equals(abc) is " + ab.equals(abc)); //true
	    System.out.println("    ab value is " + ab); */
	   

	}
}