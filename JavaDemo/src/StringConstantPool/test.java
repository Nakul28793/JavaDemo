package StringConstantPool;

public class test {
	
	public static void main(String args[])
	{
		String s1="Arpit";
		String s2=new String("Arpit");
		String s3="Arpit";
		String s4="Nakul";
		String s5=new String("soni");
		int i=30;
		System.out.println("s1.hashCode()-->"+s1.hashCode());
		System.out.println("s2.hashCode()-->"+s2.hashCode());
		System.out.println("s3.hashCode()-->"+s3.hashCode());
		System.out.println("s4.hashCode()-->"+s4.hashCode());
		System.out.println("s5.hashCode()-->"+s5.hashCode());
		System.out.println(s5);
		System.out.println(i);


	}

}
