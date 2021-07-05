// Runnable Interface
// Lambda expression


package com.pcsglobal;

/* No need for a separate class as this already has been implemented as Lambda expression
class Hihi implements Runnable    	// Because of non use of multiple inheritance in Java
									// We implement a Runnable thread and extend a class
{
	public void run()
	{
		for (int i=0; i<5; i++) 
		{
			System.out.println("Hi");
			try { Thread.sleep(50); } catch(Exception e) {}  
		}
	}
}
*/

/* No need for a separate class as this already has been implemented as Lambda expression
class HelloHello implements Runnable    // @FunctionalInterface -> we find the Runnable interface is of this type
										// That is it can have only one abstract method which is run() method 
										// Hence, the question of Lambda expression comes into picture
{
	public void run()
	{
		for (int i=0; i<5; i++)
		{
			System.out.println("Hello");
			try { Thread.sleep(50); } catch (Exception e) {} 
		}
	}
}
*/

public class ThreadRunnableInterfaceDemo 
{
	public static void main(String[] args) 
	{
		// Hihi obj1 = new Hihi(); 
		// Runnable obj1 = new Hihi(); 	// Better to reference Runnable Interface and instantiate the Class object
		
		// Using LAMBDA Expression
		// 1st Step:-
		/*
		Runnable obj1 = new Runnable() {  // run() method of class Hihi
			public void run()
			{
				for (int i=0; i<5; i++) 
				{
					System.out.println("Hi");
					try { Thread.sleep(50); } catch(Exception e) {}  
				}
			}
		};
		*/
		
		//2nd Step:-
		/*
		Runnable obj1 = () ->    // This is Lambda expreassion as we already know new Runnable()
			{
				for (int i=0; i<5; i++) 
				{
					System.out.println("Hi");
					try { Thread.sleep(50); } catch(Exception e) {}  
				}
			}
		;
		*/
		
		// HelloHello obj2 = new HelloHello();
		// Runnable obj2 = new HelloHello(); // Better to reference Runnable Interface and instantiate the Class object
		
		// Using LAMBDA Expression
		
		// 1st Step:-
		/*
		Runnable obj2 = new Runnable() {  // run() method of class HelloHello
			public void run()
			{
				for (int i=0; i<5; i++) 
				{
					System.out.println("Hello");
					try { Thread.sleep(50); } catch(Exception e) {}  
				}
			}
		};
		*/
		
		//2nd Step:-
		/*
		Runnable obj2 = () ->    // This is Lambda expreassion as we already know new Runnable()
			{
				for (int i=0; i<5; i++) 
				{
					System.out.println("Hello");
					try { Thread.sleep(50); } catch(Exception e) {}  
				}
			}
		;
		*/
		
		// Thread t1 = new Thread(obj1); // Runnable object can be passed to Thread() so as to override the 
										 // run() method of obj1, otherwise the output is nothing
		
		// 3rd Step for Lambda expression:-
		Thread t1 = new Thread( () ->     // Lambda expression for the obj1
				{
					for (int i=0; i<5; i++) 
					{
						System.out.println("Hi");
						try { Thread.sleep(50); } catch(Exception e) {}  
					}
				}
			);
		
		// Thread t2 = new Thread(obj2);	// Runnable object can be passed to Thread() so as to override the 
										// run() method of obj2, otherwise the output is nothing
		
		// 3rd Step for Lambda expression:-
		Thread t2 = new Thread( () ->     // Lambda expression for the obj2
				{
					for (int i=0; i<5; i++) 
					{
						System.out.println("Hello");
						try { Thread.sleep(50); } catch(Exception e) {}  
					}
				}
			);
		
		// obj1.start();      	// obj1 does not have start() method as it is a method of Thread class. 
								// So, need to create an thread object t1;
		t1.start();				// But, this thread start() method will call the Thread run() method
								// hence if we run this program there is no output
								// To overcome this we need to pass the Runnable object as argument of Thread 
		try { Thread.sleep(10); } catch (Exception e) {}
		// obj2.start();		// obj2 does not have start() method as it is a method of Thread class. 
								// So, need to create an thread object t2;
		t2.start();				// But, this thread start() method will call the Thread run() method
								// hence if we run this program there is no output
								// To overcome this we need to pass the Runnable object as argument of Thread 
	}

}
