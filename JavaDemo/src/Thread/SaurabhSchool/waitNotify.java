package Thread.SaurabhSchool;

public class waitNotify {

	public static void main(String args[]) 
	{
		adderThread adder = new adderThread();
		adder.start();

		synchronized (adder) 
		{
			try
			{
				System.out.println("Wating for adder to add all the elements...");
				adder.wait();
			}
			catch (InterruptedException ex) 
			{
				ex.printStackTrace();
			}
		}

		System.out.println("Total is : " + adder.total);

	}
}
