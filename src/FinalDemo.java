// Final key word
// Final keyword can be used with Variables, Methods & Class
// Final Class -> no one can extend the class
// Final Variable -> it becomes constant, no one can change the value 
// Final Method -> no one can override the method

class Final_A
//final class Final_A        // final Class -> this will prevent any other class to extend this class and use the methods
{
	//final int DAY = 0;   // final variable -> it becomes constant. Constant is required where it's required to not change it's value like PI
	final int DAY;
	
	public Final_A()
	{
		DAY = 10;   // The final field Final_A.i cannot be assigned, but if it is not assigned during declaration then can be assigned within the constructor
	}
	
	public void show() 
	//final public void show()      // final method
	{
		//DAY = 7;            // After assignment it cannot be changed
		System.out.println("In Final_A show");
	}
}

class Final_B extends Final_A   // The type Final_B cannot subclass the final class Final_A, this happens once Final_A Class is made final
{
	public void show()  		// Cannot override the final method from Final_A, when the Final_A.show() method is made final
	{
		System.out.println("In Final_B show");
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		Final_A obj = new Final_A();
		Final_B obj1 = new Final_B();
		obj.show();
		obj1.show();
		
		System.out.println("In Final_A i = "+obj.DAY); 	// it is fine as long as int i in Final_A is not made Final
	}
}
