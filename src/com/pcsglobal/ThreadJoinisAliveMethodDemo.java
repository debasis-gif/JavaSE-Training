// Thread Join
// Thread IsAlive

package com.pcsglobal;

public class ThreadJoinisAliveMethodDemo 
{

	public static void main(String[] args) throws Throwable // join() method needs to handle exception
	{
		Thread t1 = new Thread( () ->     
			{
				for (int i=0; i<5; i++) 
				{
					System.out.println("Hi");
					try { Thread.sleep(50); } catch(Exception e) {}  
				}
			}
		);

		Thread t2 = new Thread( () ->     
			{
				for (int i=0; i<5; i++) 
				{
					System.out.println("Hello");
					try { Thread.sleep(50); } catch(Exception e) {}  
				}
			}
		);
		
		t1.start();	
		try { Thread.sleep(10); } catch (Exception e) {}
		t2.start();
		
		// isAlive() -> to check if the thread is alive before join
		System.out.println("State of thread t1: "+t1.isAlive());
		System.out.println("State of thread t2: "+t2.isAlive());
		
		// Before the main thread executes the "Bye" job, we need to end the 2 threads and
		// Joins main thread after they have completed their tasks
		// join() 
		t1.join();
		t2.join();
	
		// isAlive() -> to check if the thread is alive after join
		System.out.println("State of thread t1: "+t1.isAlive());
		System.out.println("State of thread t2: "+t2.isAlive());
				
		// Printing "Bye" at the end of the threads output
		System.out.println("Bye");   // This has no control as it can print Bye in between Hi & Hello
									 // Here the main() thread takes over the job of printing "Bye"
	}

}
