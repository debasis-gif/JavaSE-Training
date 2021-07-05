// Thread Synchronizing using synchronized clause for a method()

package com.pcsglobal;

class Counter
{
	int count;
	
	// public void increment()    
	/**
	here both t1, t2 threads will try to access the method to increment count
	but many a times they will try access at the same time so increment is one time 
	We need to introduce a synchronization between the 2 threads
	by using synchronized clause we achieve the method to be used in sync for both the threads, that is 
	only one thread will be allowed to access on the method at one time
	*/
	public synchronized void increment()
	{
		count++;
	}
}

public class ThreadSyncDemo 
{
	public static void main(String[] args) throws Exception 
	{
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable()
			{
				public void run()
				{
					for (int i=0; i<1000; i++)
					{
						c.increment();
					}
				}
			});

		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				for (int i=0; i<1000; i++)
				{
					c.increment();
				}
			}
		});
		
		t1.start();    // Now, both the threads will access the synchronized method
		t2.start();
		
		t1.join();	  // Still the result might not be 2000 every time if the threads join to the main thread
		t2.join();	  // post which the main thread prints the value of count
		
		//try { Thread.sleep(1000); } catch(Exception e) {}  // This delay is introduced otherwise everytime 
			// the value of count will be zero as main thread will execute first for printing the value
			// No need for sleep() if both the threads join back to main()
		
		System.out.println("Count = "+c.count);
	}

}
