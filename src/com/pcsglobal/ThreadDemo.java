// THREAD class
// 1) show being non thread classes how "Hi" & "Hello" being displayed sequentially 
// 2) show how a Thread method "sleep() suspends a class (which is also a thread) for the sleep period
// 3) show how 2 Threads run parallel using each class as a thread by inheriting Thread class
// 4) show how just be extending a Thread class will not make the functionality of parallel processing automatic.
//    This is achieved with "start()", "run()" & "join()" method of Thread

package com.pcsglobal;

class Hi extends Thread     // make the Class a Thread type
{
	// public void show() 	// Once the Class extends Thread it has to override run() method of thread. 
							// So if there is only one method in class then it has to be run()
	public void run()
	{
		for (int i=0; i<5; i++) 
		{
			System.out.println("Hi");
			try { Thread.sleep(50); } catch(Exception e) {}  // It will suspend the thread for 500 milliseconds
									// need to handle this exception, but as we know there won't be any exceptiom
									// we handled it in one line
		}
	}
}

class Hello extends Thread     // make the Class a Thread type
{
	// public void show() 		// Once the Class extends Thread it has to override run() method of thread. 
								// So if there is only one method in class then it has to be run()
	public void run()
	{
		for (int i=0; i<5; i++)
		{
			System.out.println("Hello");
			try { Thread.sleep(50); } catch (Exception e) {} 
		}
	}
}

public class ThreadDemo  // not yet a thread class
{
	public static void main(String[] args)    // main thread - 1 thread by default
	{
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();

		// This will produce 5 Hi first and 5 Hello in sequence, as Class Hi is executed first followed by Hello
		// obj1.show();
		// obj2.show(); 
		
		// This starts the two thread in parallel but still it does not achieve Hi, Hello, Hi, Hello....
		// Reason being at some of point both the processes reach the OS scheduler at the same time asking for 
		// Execution time. Scheduler based on certain selection criteria will schedule one of the threads for execution
		// But in this case the scheduler cannot find a criteria to decide the priority between the 2 threads
		// Hence it will choose a thread in random
		// Therefore the soln is to introduce a delay of execution between the 2 threads let's say a delay of 10 ms
		
		obj1.start();  	// start() automatically calls run() method
		try { Thread.sleep(10); } catch (Exception e) {}   // The delay needs to be very small
		obj2.start();
		
	}
}
