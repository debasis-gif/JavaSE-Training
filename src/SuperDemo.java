// Super Class
class A
{
	public A()       // Super
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}

class B extends A		// Sub
{
	public B()
	{
		super();   // Compiler by default puts in this super method even if it is not declared
		// super(5);   
		System.out.println("in B");
	}
	public B(int i)
	{
		super();   // Compiler by default puts in this super method even if it is not declared
		// super(i);
		System.out.println("in B int");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		B obj1 = new B(); // This will call the default constructor of both B and A as it also has super() call by compiler by default
		// B obj1 = new B(5);  // This will call the Super() constructor default of Class A and parameterized constructor of class B
		// B obj1 = new B(5);  // This will call the parameterized Super(int) constructor of Class A and parameterized constructor of class B
		// B obj1 = new B();  // This will call the parameterized Super(int) constructor of Class A and default constructor of class B
	}
}
