// Assignment - Abstract class
// Understanding the difference between Abstract and Interface

class Pen extends Writer
{
	public void write()
	{
		System.out.println("I am Pen");
	}
}

class Pencil extends Writer
{
	public void write()
	{
		System.out.println("I am Pencil");
		System.out.println("I have a different fnc from a Pen");
	}	
}

class Kit
{
	public void doSomething(Writer p)     // passing the object with reference abstract class which is extended as an argument, 
	{									  // so, that the respective write method from the classes are called
		p.write();
	}
}

abstract class Writer					// an abstract layer/class has been created which does not implement any method
{										// but this gives the class Pen & Pencil to extend the abstract class and implement the method in it's own way
	public abstract void write();
}

public class AbstractAssignment {

	public static void main(String[] args) {
		Kit k = new Kit();
		Writer p = new Pen();		// p is reference of superclass abstract Writer class and Pen as an object implementation
		Writer pc = new Pencil();	// pc is reference of superclass abstract Writer class and Pencil as an object implementation
		
		k.doSomething(p); 			// Since now, both the Pen and Pencil class extends the abstract class Writer, 
		k.doSomething(pc);			// so doSomething method with Writer class as argument can call a method write() from any of the Pen or Pencil classes,
									// as per the type of argument passed
	}
}
