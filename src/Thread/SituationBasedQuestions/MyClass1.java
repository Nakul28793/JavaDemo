package Thread.SituationBasedQuestions;
/*	http://www.javamadesoeasy.com/2015/03/suppose-you-have-2-threads-thread-1-and_5.html
 * 
 * 	Suppose you have 2 threads (Thread-1 and Thread-2) on same object. 
 *  Thread-1 is in synchronized method1(), can Thread-2 enter synchronized method2() at same time in java?
 * 
 * No, here when Thread-1 is in synchronized method1() it must be holding lock on object’s monitor and will release lock on object’s monitor only when it exits synchronized method1(). 
 * So, Thread-2 will have to wait for Thread-1 to release lock on object’s monitor so that it could enter synchronized method2().
 */
class MyRunnable1 implements Runnable {

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


public class MyClass1 {
	public static void main(String args[]) throws InterruptedException 
	{

		MyRunnable1 myRunnable1 = new MyRunnable1();

		Thread thread1 = new Thread(myRunnable1, "Thread-1");
		Thread thread2 = new Thread(myRunnable1, "Thread-2");
		
		thread1.start();
		
		Thread.sleep(10);// Just to ensure Thread-1 starts before Thread-2
		
		thread2.start();

	}

}