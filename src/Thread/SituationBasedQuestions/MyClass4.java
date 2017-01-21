package Thread.SituationBasedQuestions;
/*
 * Suppose you have thread and it is in synchronized method and now can thread enter other synchronized method from 
 * that method in java?
 * 
 * Yes, here when thread is in synchronized method it must be holding lock on object’s monitor and 
 * using that lock thread can enter other synchronized method.
 */
class MyRunnable4 implements Runnable {

	@Override
	public void run()
	{
		method1();
	}

	synchronized void method1() 
	{
		System.out.println("synchronized method1() started");
		method2();
		System.out.println("synchronized method1() ended");
	}

	synchronized void method2() 
	{
		System.out.println("in synchronized method2()");
	}

}


public class MyClass4 {
	public static void main(String args[]) throws InterruptedException 
	{
		MyRunnable4 myRunnable4 = new MyRunnable4();
		Thread thread1 = new Thread(myRunnable4, "Thread-1");
		thread1.start();

	}

}