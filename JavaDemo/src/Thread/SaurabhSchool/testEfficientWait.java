package Thread.SaurabhSchool;

public class testEfficientWait {
	public static void main(String args[])
	{
		final efficientWait sObj=new efficientWait(); //shared object among Thread A and B
		Thread A=new Thread()
		{	
			@Override
			public void run()
			{
				System.out.println("Thread A : Just Waiting : Not using CPU I am efficient");
				
				sObj.plzWait();
				//waiting efficiently
				//is good as CPU is Not being utilized by Thread A
				
				System.out.println("Thread A : Now ready for work");
			}
		};
		
		Thread B=new Thread()
		{	
			@Override
			public void run()
			{
				try
				{
					System.out.println("Thread B : Sleep for some time");
					sleep(1000);
					System.out.println("Now make thread A Ready for work");
					System.out.println("Notify thread A");
					sObj.plzNotify();
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
		};
		A.start();
		B.start();
	}


}
