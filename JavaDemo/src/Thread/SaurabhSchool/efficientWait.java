package Thread.SaurabhSchool;

public class efficientWait {

	sharedObject mySharedObject = new sharedObject();

	public void plzWait() 
	{
		synchronized (mySharedObject) 
		{
			try
			{
				mySharedObject.wait();	
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	public void plzNotify() 
	{
		synchronized (mySharedObject) 
		{
			mySharedObject.notify();
		}
	}

}

class sharedObject{
	
}