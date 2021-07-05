/* ------------------------------------------------------------------------------------------------------*/
// This Demo shows how to resolve Multiple Inheritance issue with Interfaces (from Java 1.8)
// Java does not support multiple inheritance due to the issue of ambiguity as to pick which method
// Similar multiple inheritance issues can come up with Interface specially after ver 1.8 
// where a method could be declared (abstract) and defined (default) - so can raise the ambiguity issues
// Using Super Interface this issue is resolved
/* ------------------------------------------------------------------------------------------------------*/

@FunctionalInterface
interface Demo2
{
	void abc();				// in Functional Interface we can have only one abstract method
	
	default void show()   // In interface we cannot define a method because it needs to use abstract method only
						  // from 1.8 we can define methods in Interface by using "default" 
	{
		System.out.println("In Demo2 show()");
	}
}

interface MyDemo
{
	default void show()
	{
		System.out.println("In MyDemo show()");
	}
}

class DemoImp1 implements Demo2, MyDemo
{
	public void abc()
	{
		System.out.println("In DemoImp1 abc()");
	}

	// if we do not override show() in Demo2 or MyDemo interface this gives an Override error
	// Click on the error and select "override Default method in Demo2"  or "override Default method in MyDemo"
	// This gives the following @Override annotation along with the method show()

	// @Override
	public void show() {
		Demo2.super.show();  // OR, MyDemo.super.show();
	} 
}

public class InterfaceMultipleInheritanceIssueDemo {

	public static void main(String[] args) {
		Demo2 obj = new DemoImp1();
		obj.abc();
		obj.show();
	}

}
