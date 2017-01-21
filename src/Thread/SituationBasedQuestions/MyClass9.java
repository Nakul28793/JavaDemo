package Thread.SituationBasedQuestions;
/*
 * Suppose you have 2 threads (Thread-1 on object1 and Thread-2 on object2). 
 * Thread-1 is in static synchronized method1(), can Thread-2 enter static synchronized method2() at same time in java?
 * 
 * No, it might confuse you a bit that threads are created on different objects. 
 * But, not to forgot that multiple objects may exist but there is always one class’s class object lock available.
   Here, when Thread-1 is in static synchronized method1() 
   it must be holding lock on class class’s object and will release lock on class’s class object only 
   when it exits static synchronized method1(). 
   So, Thread-2 will have to wait for Thread-1 to release lock on class’s class object 
   so that it could enter static synchronized method2().
 */
class MyRunnable9 implements Runnable {

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
		System.out.println(Thread.currentThread().getName() + " in synchronized void method1() started");
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in synchronized void method1() ended");
	}

	static synchronized void method2()
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

/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class MyClass9 {
	public static void main(String args[]) throws InterruptedException 
	{

		MyRunnable9 object1 = new MyRunnable9();
		MyRunnable9 object2 = new MyRunnable9();

		Thread thread1 = new Thread(object1, "Thread-1");
		Thread thread2 = new Thread(object2, "Thread-2");
		
		thread1.start();
		Thread.sleep(10);// Just to ensure Thread-1 starts before Thread-2
		thread2.start();

	}

}