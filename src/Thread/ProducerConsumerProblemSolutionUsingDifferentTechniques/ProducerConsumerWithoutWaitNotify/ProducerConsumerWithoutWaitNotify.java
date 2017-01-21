package Thread.ProducerConsumerProblemSolutionUsingDifferentTechniques.ProducerConsumerWithoutWaitNotify;
/*http://www.javamadesoeasy.com/2015/03/how-to-solve-consumer-producer-problem.html
 * How to solve Consumer Producer problem without using wait() and notify() methods, 
 * where consumer can consume only when production is over in java.
 */
import java.util.ArrayList;

/* Producer is producing, Producer will allow consumer to
 * consume only when 10 products have been produced (i.e. when production is over).
 */
class Producer implements Runnable {

	boolean productionInProcess;
	ArrayList<Integer> list;
	//List<Integer> list;

	Producer() 
	{
		 // initially Producer will be producing, so make this productionInProcess true.
		productionInProcess = true;
		list = new ArrayList<Integer>();
		//list=new LinkedList<Integer>();
	}

	@Override
	public void run() 
	{
		for (int i = 1; i <= 10; i++)
		{ // Producer will produce 10 products
			list.add(i);
			System.out.println("Producer is still Producing, Produced : " + i);

			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}

		}
		/* Once production is over, make this productionInProcess false.
         * Production is over, consumer can consume.
         */
		productionInProcess = false; 	

	}

}

class Consumer extends Thread {
	Producer prod;

	Consumer(Producer obj) 
	{
		prod = obj;
	}

	public void run() {
		/*
		 * consumer checks whether productionInProcess is true or not, 
		 * if it's true, consumer will sleep and wake up after certain time 
		 * and again check whether productionInProcess is true or false. 
		 * process will repeat till productionInProcess is true. 
		 * Once productionInProcess is false we'll exit below while loop.
		 */
		while (this.prod.productionInProcess) 
		{ // costing us performance
			System.out.println("Consumer waiting for production to get over.");
			try 
			{
				Thread.sleep(4000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		/*
		 * productionInProcess is false means production is over, 
		 * consumer will start consuming.
		 */
		System.out.println("Production is over, consumer can consume.");
		int productSize = this.prod.list.size();
		for (int i = 0; i < productSize; i++)
			System.out.println("Consumed : " + this.prod.list.remove(0) + " ");

	}

}


public class ProducerConsumerWithoutWaitNotify {
	public static void main(String args[]) 
	{
		Producer prod = new Producer();
		Consumer cons = new Consumer(prod);

		Thread prodThread = new Thread(prod, "prodThread");
		Thread consThread = new Thread(cons, "consThread");

		prodThread.start(); // start producer thread.
		consThread.start(); // start consumer thread.

	}

}
