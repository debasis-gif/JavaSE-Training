// Abstract Class & Abstract Methods
// Abstract Class is created with unimplemented methods
// Abstract Class can also have abstract methods
// An object cannot be created of an abstract class
// Abstract Class can be extended (inherited) by another class
// The class extending an abstract class needs to implement the methods of the abstract class

abstract class Human     // abstract class
{
	public abstract void eat(); // abstract method does not need a body unlike the normal methods

	public void walk()
	{
		
	}
}

class Man extends Human    // Concrete Class -> The type Man must implement the inherited abstract method Human.eat()
{
	public void eat()
	{
		System.out.println("Extension method of abstract class");
	}
}

public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		// Human obj = new Human(); // Cannot instantiate the type Human -> An object cannot be created of an abstract class
		Human obj = new Man();
		obj.eat();
		
		Printer obj1 = new Printer();
		obj1.show(4.4, 5);
		//obj1.show(4.5);
	}
}

/* Notes:-
 * Why do we need Abstract Class
 * check class Printer
 * So, we learn the abstract class is used so that no object can be created out of it
 * Multiple classes can extend an abstract class and that abstract class can be used instead - e.g. Number class being extended by Double, Integer
*/

class Printer
{
	/*
	public void show(Integer i)   // Wrapper class used
	{
		System.out.println(i);
	}
	
	public void show(Double i)    // Wrapper Class used
	{
		System.out.println(i);
	} 
	*/
	
	public void show(Number i, Number j)    	// Number is the abstract class for Integer & Double & Float... 
												// So instead of having multiple methods for Wrapper class Integer, Double we can have one method 
												// using the abstract class Number which is extended by Integer, Double etc
	{
		System.out.println("Number class: "+i + ", "+j);
	}
}








