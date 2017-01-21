import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
			 			int i = 10; //10
			 	static 	int j = 20; //20
			  	final 	int k = 30;	//30
	transient	static 	int l = 40;	//40
	transient 	final	int m = 50;	//50
	transient 			int n = 60; //0
	transient    String password = "60"; //null
}

public class SerializationDemo {
	public static void main(String args[])  throws Exception{
		Dog d1 = new Dog();
		try
		{
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);
			System.out.println("Serialized data is saved in abc.ser file");
		
		
		
			FileInputStream fis=new FileInputStream("abc.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Dog d2=(Dog)ois.readObject();
			System.out.println(d2.i+".."+d2.j+".."+d2.k+".."+d2.l+".."+d2.m+".."+d2.n+".."+d2.password);  
		
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		catch (ClassNotFoundException c) 
		{
			System.out.println("Dog class not found");
			c.printStackTrace();
		
		}
	}
}