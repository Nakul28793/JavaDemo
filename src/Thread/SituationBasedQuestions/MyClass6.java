package Thread.SituationBasedQuestions;
/*
 * Suppose you have thread and it is in static synchronized method and 
 * now can thread enter other non static synchronized method from that method in java?
 * 
 * Yes, here when thread is in static synchronized method it must be holding lock on class’s class object and 
 * when it enters synchronized method it will hold lock on object’s monitor as well.
	So, now thread holds 2 locks (it’s also called nested synchronization)-
	>first one on class’s class object.
	>second one on object’s monitor (This lock will be released when thread exits non static method). 
 */
class MyRunnable6 implements Runnable {

	@Override
	public void run() 
	{
		method1();
	}

	static synchronized void method1() 
	{
		System.out.println("static synchronized method1() started");
		MyRunnable6 myRunnable6 = new MyRunnable6();
		myRunnable6.method2();
		System.out.println("static synchronized method1() ended");
	}

	synchronized void method2() 
	{
		System.out.println("in synchronized method2()");
	}

}


public class MyClass6 {
	public static void main(String args[]) throws InterruptedException {

		MyRunnable6 myRunnable6 = new MyRunnable6();
		Thread thread1 = new Thread(myRunnable6, "Thread-1");
		thread1.start();

	}

}
