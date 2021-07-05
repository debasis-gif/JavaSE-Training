// Interface 
// Java does not support multiple Inheritance (a class cannot extend more than one class) 
// Idea of Abstract class in expanded to have Interface which resolves the above difficulty with extends and implements functionality
// We can have reference to an Interface, but cannot create an object of Interface similar to abstract class
// The main difference between Interface and Abstract is that Interface cannot define any methods can only declare, whereas Abstract class can define a method
// In Interface all methods are public abstract do not have any method body
// Interface does not have constructor as it is not a class
// Interface is used for generalization, prototype creation, feature requirements

interface Abc
{
	void show();
}

class Implementor implements Abc
{
	public void show()
	{
		System.out.println("in Implementor Class..");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		//Abc obj = new Abc();  		// Cannot instantiate the type Abc as Abc is an interface
		Abc obj = new Implementor();    // Hence need to create a Class which implements interface Abc
		obj.show();
		
		// OR using Anonymous class we can implement the method of interface Abc

		Abc obj1 = new Abc()
				{
					public void show()
					{
						System.out.println("in Anonymous Class to implement the interface");
					}
				};

		// Lambda expression 
		//Abc obj1 = () -> System.out.println("in Anonymous Class to implement the interface");
			
		obj1.show();
	}
}



