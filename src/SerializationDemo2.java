import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 * If a class implements serializable then all its sub classes will also be serializable
 */
class Animal2
{
						int i = 10; //10
				
}

class Dog2 extends Animal2 implements Serializable{
			 			
						int j = 20; //999
}

public class SerializationDemo2 {
	public static void main(String args[])  throws Exception{
		Dog2 d1 = new Dog2();
		d1.i=888;
		d1.j=999;
		try
		{
			FileOutputStream fos = new FileOutputStream("abc2.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);
			System.out.println("Serialized data is saved in abc2.ser file");
		
		
		
			FileInputStream fis=new FileInputStream("abc2.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Dog2 d2=(Dog2)ois.readObject();
			System.out.println(d2.i+".."+d2.j);  
		
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		catch (ClassNotFoundException c) 
		{
			System.out.println("Dog1 class not found");
			c.printStackTrace();
		
		}
	}
}