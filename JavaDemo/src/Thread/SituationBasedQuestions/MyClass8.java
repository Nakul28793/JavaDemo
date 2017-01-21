package Thread.SituationBasedQuestions;
/*
 * Suppose you have 2 threads (Thread-1 on object1 and Thread-2 on object2). 
 * Thread-1 is in synchronized method1(), can Thread-2 enter synchronized method2() at same time in java?
 * 
 * Yes, here when Thread-1 is in synchronized method1() it must be holding lock on object1’s monitor. 
 * Thread-2 will acquire lock on object2’s monitor and enter synchronized method2().
 */
class MyRunnable8 implements Runnable {

	@Override
	public void run() 
	{
		if (Thread.currentThread().getName().equals("Thread-1"))
			method1();
		else
			method2();
	}

	synchronized void method1() 
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


public class MyClass8 {
	public static void main(String args[]) throws InterruptedException 
	{

		MyRunnable8 object1 = new MyRunnable8();
		MyRunnable8 object2 = new MyRunnable8();

		Thread thread1 = new Thread(object1, "Thread-1");
		Thread thread2 = new Thread(object2, "Thread-2");
		
		thread1.start();
		Thread.sleep(10);// Just to ensure Thread-1 starts before Thread-2
		thread2.start();

	}

}