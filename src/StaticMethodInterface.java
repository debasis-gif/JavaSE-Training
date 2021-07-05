// Default modifier method in an Interface can be called in a long way ->
// Because an Interface object cannot be created we cannot straightaway call method show() of interface
// We needed to create a class which implements the Interface and then will reference the object with Interface but instantiate the class object
// Then we call the method show() through the object -> This is a long process
// STATIC modifier method -> calling a defined Static method does not require an object instantiation, the same holds true for Interface
// Now we can define a method as Static first time in Java from 1.8
// So, now we can directly call a method from an Interface without creating an object
// Variable: a FINAL modifier variable (CONSTANT) can always be created inside an Interface

interface Demo3
{
	int version = 10;   // a variable created inside Interface is always a Constant and must have an assigned value. 
						// Final keyword is understood
						// it cannot be changed in the implemented classes
	void abc();
	static void show()
	{
		System.out.println("In Demo3 Interface version"+version);
	}
}

public class StaticMethodInterface {

	public static void main(String[] args) {
		// Demo3 obj = new Demo3();    // We cannot instantiate an Interface object
		Demo3.show();
	}

}
