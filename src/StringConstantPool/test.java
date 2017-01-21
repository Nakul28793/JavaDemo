package StringConstantPool;

public class test {
	
	public static void main(String args[])
	{
		String s1="Arpit";
		String s2=new String("Arpit");
		String s3="Arpit";
		System.out.println("s1.hashCode()-->"+s1.hashCode());
		System.out.println("s2.hashCode()-->"+s2.hashCode());
		System.out.println("s3.hashCode()-->"+s3.hashCode());
	}

}
