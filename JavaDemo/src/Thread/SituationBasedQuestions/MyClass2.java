package Thread.SituationBasedQuestions;
/*
 * Suppose you have 2 threads (Thread-1 and Thread-2) on same object. Thread-1 is in static synchronized method1(), 
 * can Thread-2 enter static synchronized method2() at same time in java?
 * 
 * No, here when Thread-1 is in static synchronized method1() it must be holding lock on class class’s object 
 * and will release lock on class’s class object only when it exits static synchronized method1(). 
 * So, Thread-2 will have to wait for Thread-1 to release lock on class’s class object so that it could enter static synchronized method2().
 */
class MyRunnable2 implements Runnable {

	@Override
	public void run() 
	{
		if (Thread.currentThread().getName().equals("Thread-1"))
			method1();
		else
			method2();
	}

	static synchronized void method1() 
	{
		System.out.println(Thread.currentThread().getName() + " in static synchronized void method1() started");
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in static synchronized void method1() ended");
	}

	static synchronized void method2() 
	{
		System.out.println(Thread.currentThread().getName() + " in static synchronized void method2() started");
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in static synchronized void method2() ended");
	}

}


public class MyClass2 {
	public static void main(String args[]) throws InterruptedException 
	{

		MyRunnable2 myRunnable2 = new MyRunnable2();

		Thread thread1 = new Thread(myRunnable2, "Thread-1");
		Thread thread2 = new Thread(myRunnable2, "Thread-2");
		
		thread1.start();
		
		Thread.sleep(10);// Just to ensure Thread-1 starts before Thread-2
		
		thread2.start();

	}

}