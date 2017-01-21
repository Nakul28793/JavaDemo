package Thread.SaurabhSchool;

public class testSignalling {
	//tests busy wait method
	public static void main(String args[])
	{
		final sendSignal sObj=new sendSignal(); //shared object among thread A and B
		Thread A=new Thread()
		{	
			@Override
			public void run()
			{
				while(!sObj.isReady())
				{
					//bust waiting
					//is not good as CPU is being utilized by Thread A
					System.out.println("Thread A : Just Busy Waiting");
					
				}
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
					sleep(1);
					System.out.println("Now make thread A Ready for work");
					sObj.setReady(true);
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
