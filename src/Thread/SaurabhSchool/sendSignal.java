package Thread.SaurabhSchool;
/*
 * Programming Interview: Thread Signalling via Shared Object (Busy Waiting)
 * https://www.youtube.com/watch?v=Q3io7dhceH8&index=14&list=PLTZbNwgO5ebr1O4i3CI9XHLJmiKBRRZsL
 */
public class sendSignal {

	private boolean ready;

	sendSignal() 
	{
		ready = false;
	}

	public synchronized boolean isReady() 
	{
		return ready;
	}

	public synchronized void setReady(boolean ready) 
	{
		this.ready = ready;
	}

}
