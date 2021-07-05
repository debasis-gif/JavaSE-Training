// Abstract Class -> Define & declare
// Interface -> declare -> till Java 1.7
// Interface -> Define & declare -> from Java 1.8

@FunctionalInterface 		// This annotation prevents compilation error 
							// we cannot have more than 1 abstract methods in Interface
							// but we can have more than 1 default methods in Interface
interface Demo
{
	void abc();
	//public void show()   // public method is normal but Interface requires abstract methods, 
	default void show()	   // hence use of public is not allowed
						   // hence using default keyword
	{
		System.out.println("in Interface show()");
	}
}

class DemoImp implements Demo
{
	public void abc()   // Here, DemoImp must implement the declared method in Interface Demo
	{
		System.out.println("in DemoImp class abc()");
	}
	/*
	public void show()	  
	{
		System.out.println("in DemoImp class show()");
	}
	*/
}

public class DefaultMethodInterfaceDemo {

	public static void main(String[] args) 
	{
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();     // This goes to Interface show() in case there is no method overriding in the class that implements the interface
						// Otherwise the show() method of Class DemoImp is called
	}
}
