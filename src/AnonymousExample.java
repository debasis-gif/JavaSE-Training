// Anonymous Class
// Need: It is sometimes required to define the class at runtime at the point of instantiation of an object.
// This takes away the unnecessary requirement of method overriding and creation of a new class with the same method but with different functionality
// When the requirement is only to override a method of a class this can be achieved by using anonymous class during object creation
// Anonymous class can be used one time and cannot be reused as this class does not have a name

class Ano_A
{
	public void show()
	{
		System.out.println("in Ano_A show()");
	}
}

class Ano_B extends Ano_A
{
	public void show()
	{
		System.out.println("in Another class for method Overriding..");
	}
}

public class AnonymousExample {

	public static void main(String[] args) 
	{
		// Ano_A obj = new Ano_B();  // reference class Ano_A and object implementation for Ano_B
		// obj.show();				  // Calls method show() of Ano_B which extends Ano_A as reference
		Ano_A obj = new Ano_A() 	  // Anonymous class creation during object instantiation therefore class Ano_B is not required anymore
					{
						public void show()
						{
							System.out.println("Anonymous class for method Overriding..");
						}
					};
		obj.show();	
	}
}
