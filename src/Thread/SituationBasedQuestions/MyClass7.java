package Thread.SituationBasedQuestions;
/*
 * Suppose you have thread and it is in synchronized method and 
 * now can thread enter other static synchronized method from that method in java?
 * 
 * Yes, here when thread is in synchronized method it must be holding lock on object’s monitor 
 * and when it enters static synchronized method it will hold lock on class’s class object as well.
	So, now thread holds 2 locks (it’s also called nested synchronization)-
	>first one on object’s monitor.
	>second one on class’s class object.(This lock will be released when thread exits static method).
 */
class MyRunnable7 implements Runnable {

	@Override
	public void run() 
	{
		method1();
	}

	synchronized void method1() 
	{
		System.out.println("synchronized void method1() started");
		method2();
		System.out.println("synchronized void method1() ended");
	}

	static synchronized void method2() 
	{
		System.out.println("in static synchronized method2()");
	}

}


public class MyClass7 {
	public static void main(String args[]) throws InterruptedException 
	{

		MyRunnable7 myRunnable7 = new MyRunnable7();
		Thread thread1 = new Thread(myRunnable7, "Thread-1");
		thread1.start();

	}

}