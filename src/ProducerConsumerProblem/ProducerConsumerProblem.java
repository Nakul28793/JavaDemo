package ProducerConsumerProblem;

import java.util.Vector;

public class ProducerConsumerProblem {

	public static void main(String args[]) {
		Vector sQueue = new Vector();
		int size = 4;
		Thread producerThread = new Thread(new Producer(sQueue, size),
				"Producer");
		Thread consumerThread = new Thread(new Consumer(sQueue, size),
				"Consumer");

		producerThread.start();
		consumerThread.start();
	}
}

class Producer implements Runnable {
	private final Vector sQueue;
	private final int SIZE;

	public Producer(Vector sQueue, int size) {
		this.sQueue = sQueue;
		this.SIZE = size;
	}

	public void run() {
		for (int i = 0; i < 12; i++) {
			System.out.println("Producer is trying to insert item :" + i);
			try {
				produce(i);
			} catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		while (sQueue.size() == SIZE) {
			synchronized (sQueue) {
				System.out.println("Queue is full "
						+ Thread.currentThread().getName()
						+ " is waiting, size: " + sQueue.size());
				sQueue.wait();
			}
		}

		synchronized (sQueue) {
			sQueue.add(i);
			sQueue.notify();
		}
	}
}

class Consumer implements Runnable {
	private final Vector sQueue;
	private final int SIZE;

	public Consumer(Vector sQueue, int size) {
		this.sQueue = sQueue;
		this.SIZE = size;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("Consume elements " + Consumer());
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}

	private int Consumer() throws InterruptedException {
		while (sQueue.isEmpty()) {
			synchronized (sQueue) {
				System.out
						.println("Queue is empty "
								+ Thread.currentThread().getName()
								+ " is waiting for new element inserted by a producer, size: "
								+ sQueue.size());
				sQueue.wait();
			}
		}

		synchronized (sQueue) {
			sQueue.notifyAll();
			return (Integer) sQueue.remove(0);
		}
	}
}
