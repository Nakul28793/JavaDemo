package Thread.SituationBasedQuestions;
/*
 * Suppose you have thread and it is in static synchronized method and 
 * now can thread enter other static synchronized method from that method in java?
 * 
 * Yes, here when thread is in static synchronized method it must be holding lock on class’s class object 
 * and using that lock thread can enter other static synchronized method.
 */
class MyRunnable5 implements Runnable {

	@Override
	public void run() 
	{
		method1();
	}

	static synchronized void method1() 
	{
		System.out.println("static synchronized void method1() started");
		method2();
		System.out.println("static synchronized void method1() ended");
	}

	static synchronized void method2() 
	{
		System.out.println("in static synchronized method2()");
	}

}


public class MyClass5 {
	public static void main(String args[]) throws InterruptedException
	{
		MyRunnable5 myRunnable5 = new MyRunnable5();
		Thread thread1 = new Thread(myRunnable5, "Thread-1");
		thread1.start();
	}

}