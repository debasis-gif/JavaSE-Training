// Method overriding, Dynamic Method dispatch / Polymorphism 

class A_Mo
{
	int i;
	public void show()
	{
		System.out.println("i = " + i + " in A_Mo");
	}	
}

class B_Mo extends A_Mo
{
	int i;
	// public void show()  // show() method in B_Mo overrides show() method in A_Mo
	@Override
	public void show()    // here a typo for show method cancels method overriding and the show() method of A_Mo is executed
	{					  // to avoid this an Annotation @Override is placed so that it gets compilation error rather having a logical error
		//super.show();     // In case it is required to call the show() method of super class A as well
		super.i = 20; i = 10;      // super can also be used with variables
		System.out.println("i = " + i + " in B_Mo");
	}
	public void config()
	{
		System.out.println("in B config function"); 
	}
}

class C extends A_Mo
{
	public void show()
	{
		System.out.println("in C");
	}
}

public class OverridingDemo 
{
	// Compile time and Runtime Polymorphism
	public static void main(String[] args) 
	{
		B_Mo obj = new B_Mo();
		//A_Mo obj = new B_Mo();     // "Runtime polymorphism" / Method Overriding - this will be linked during runtime
		obj.show();   
		// obj.config();  // This will work when the reference object and the implementation object is same, that is B_Mo obj = new B_Mo();
					      // This will NOT work when the reference object and the implementation object is NOT same, that is A_Mo obj = new B_Mo(); 
						  // The method config() is undefined for the type A_Mo
		//obj = new C();
		//obj.show();    		// results in B_Mo.show() call and then C.show() call  
								// "Dynamic Method Dispatch"
	}
}

/* Dynamic method dispatch / Polymorphism
 * How to create a reference of a super class and to create an object of a sub class
 * we can create the reference of a superclass A_Mo and object of a sub class B_Mo
 * A_Mo obj = new B_Mo();
 * so when a method is called show() it will call show() of B_Mo as it is the object that is implemented even if A_Mo superclass was referenced
 * Implementation of an object is important than reference object/class
 * With the example showing new object reference C the call for show() in B_Mo and then with show() of C is called
 * Compile time and Runtime Polymorphism
 * calling same methods from different objects during runtime is called "Dynamic Method Dispatch"
 */
