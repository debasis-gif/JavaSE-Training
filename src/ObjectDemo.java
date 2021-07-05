// Object, Class, Constructor (Default, Parameterized), Constructor overloading, Local & Instance Variable, this

class Calculator
{
	int num1;
	int num2;
	int result;
	
	public Calculator() // default constructor -> no need to create - everytime an object is created 
						// it will call the default constructor to allocate memory to the object
	{
		num1=5;
		num2=6;
		System.out.println("in constructor");
	}
	
	public Calculator(int num1) // Constructor overloading -> parameterized constructor
	{
		this.num1 = num1;  // instance variable with blue color and local variable with brown color. This represents the current object
		num2 = num1;
		System.out.println("in second constructor with num1 value = " + num1);
	}
	
	public void perform()
	{
		result = num1 + num2;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator(5); // constructor TBD calc is the object reference -> Calculator class is instantiated as a calc object 
											// Class is the blueprint of the Object, which knows something and does something
		calc.num1 = 10;
		calc.num2 = 20;
		
		calc.perform();
		
		System.out.println("Result of addition function = " + calc.result);
	}
	
	// Note on Constructor: 
	/* Member Method of the class, even if not defined it is default method in a class 
	 * Same name as a classname
	 * It will never return anything -> so there isn't any return type with constructor 
	 * It will be used to allocate memory to the object
	 * Constructor overloading -> same class having multiple constructor with different parameters which is also called polymorphism 
	 */
	
}
