package Thread.SaurabhSchool;
/*
 * Programming Interview: Semaphore in Operating System Multi-Threading (Part 1)
 */
public class Semaphore {
	private int value;
	public Semaphore(int init)
	{
		if(init<0)
		{
			init=0;
		}	
		value=init;
	
	}

	public synchronized void down()
	{//P=down I am acquiring resource
		while(value==0)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		value--;
	}
	
	public synchronized void up()
	{//V=up Releasing Resource
		value++;
		notify();
	}
	
	public static void main(String args[])
	{
		int noThreadsInCriticalSection=3;
		Semaphore mutex=new Semaphore(noThreadsInCriticalSection);
		for(int i=0;i<=10;i++)
		{
			new MutexThread(mutex, "Thread" + i);
		}
	}
}
