package Thread.SituationBasedQuestions;
/*
 * Suppose you have 2 threads (Thread-1 and Thread-2) on same object. Thread-1 is in synchronized method1(), 
 * can Thread-2 enter static synchronized method2() at same time in java
 * 
 * Yes, here when Thread-1 is in synchronized method1() it must be holding lock on object’s monitor and 
 * Thread-2 can enter static synchronized method2() by acquiring lock on class’s class object.
 */
class MyRunnable3 implements Runnable {

	@Override
	public void run() 
	{
		if (Thread.currentThread().getName().equals("Thread-1"))
			method1();
		else
			method2();
	}

	static synchronized void method1() 
	// 	   synchronized void method1()
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

	//static synchronized void method2()
	synchronized void method2()
	{
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() started");
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() ended");
	}

}

public class MyClass3 {
	public static void main(String args[]) throws InterruptedException {

		MyRunnable3 myRunnable3 = new MyRunnable3();

		Thread thread1 = new Thread(myRunnable3, "Thread-1");
		Thread thread2 = new Thread(myRunnable3, "Thread-2");
		
		thread1.start();
		
		Thread.sleep(10);// Just to ensure Thread-1 starts before Thread-2
		
		thread2.start();

	}

}