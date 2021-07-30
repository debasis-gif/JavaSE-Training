/*  N O T E S
 *  Types of Interface
 *  1. Normal
 *  2. Single Abstract Method - Functional Interface (from Java 8) - Lambda Expression - Scala
 *  3. Marker Interface
 */

@FunctionalInterface   // This annotation is used to prevent compilation errors 
					   // when more than one method is mentioned in a Functional interface
interface Abcd 
{
	//int x = 21;
	void show(int x);
	
}

public class FuncInterfaceLambdaExpDemo 
{

	public static void main(String[] args) 
	{
		// Lambda expression is derived due to the fact that we are using a Functional Interface
		// Functional interface has only 1 method
		// Also the known things are Abcd Interface, known method show(), so we can eliminate the knowns
		// new is not required as we cannot create an object of an Interface and also since the Anonymous class structure is also needed
		// with Lambda expression () -> System.out.println("Inside Anonymous class to implement Interface...");
	
		Abcd obj = (x)-> System.out.println("Inside Anonymous class to implement Interface..."+x);  
		// Creating an object of an Interface in one line
		// This stuff works only with Functional interface (one method) and Java 8 onwards
		obj.show(21);
	}
}
