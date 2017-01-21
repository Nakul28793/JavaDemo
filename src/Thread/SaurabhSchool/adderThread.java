package Thread.SaurabhSchool;

public class adderThread extends Thread {

	int total;

	@Override
	public void run() 
	{
		synchronized (this) 
		{
			for (int i = 0; i < 100; i++) 
			{
				total = total + i;
			}
			notify();
		}
	}
}
