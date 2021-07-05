// Thread Name     -> getName(), setName(), use thread name in anonymous method
// Thread Priority -> getPriority(), setPriority()
// Thread -> currentThread() method

package com.pcsglobal;

public class ThreadNamePriorityDemo 
{
	public static void main(String[] args) throws Exception 
	{
		Thread t1 = new Thread( () ->     // Thread(Runnable target or Object, String name), so we could name a thread
			{
				for (int i=0; i<5; i++) 
				{
					System.out.println("Hi " + Thread.currentThread().getPriority());  // printing the current thread priority
					try { Thread.sleep(50); } catch(Exception e) {}  
				}
			}, "Hi thread -> anonymous()"
		);

		Thread t2 = new Thread( () ->     // Thread(Runnable target or Object, String name), so we could name a thread
			{
				for (int i=0; i<5; i++) 
				{
					System.out.println("Hello " + Thread.currentThread().getPriority());
					try { Thread.sleep(50); } catch(Exception e) {}  
				}
			}, "Hello thread -> anonymous()"
		);
		
		// Thread getName & setName methods
		/*
		System.out.println("t1 name: "+t1.getName()); // Thread-0
		System.out.println("t2 name: "+t2.getName()); // Thread-1
		
		t1.setName("Hi thread");
		t2.setName("Hello thread");
		
		System.out.println("t1 name: "+t1.getName()); // Thread-Hi thread
		System.out.println("t2 name: "+t2.getName()); // Thread-Hello thread
		*/
		
		// Thread getPriority & setPriority
		/*
		System.out.println("t1 priority: "+t1.getPriority()); // Priority range is 1 (Min) 5 (Norm) and 10 (Max)
		System.out.println("t2 priority: "+t2.getPriority()); // Both the threads automatically will have normal priority 5
		
		t1.setPriority(1);  
		t2.setPriority(10);
		*/
		// OR
		t1.setPriority(Thread.MIN_PRIORITY);   // thread Constant
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		/*
		System.out.println("t1 priority: "+t1.getPriority()); // Priority = 1
		System.out.println("t2 priority: "+t2.getPriority()); // Priority = 10
		*/
		
		t1.start();	
		try { Thread.sleep(10); } catch (Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println("Bye");   
	}

}
