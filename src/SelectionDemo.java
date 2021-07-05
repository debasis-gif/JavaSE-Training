
public class SelectionDemo {
	/*
	 * if, switch, ternary
	 */
	public static void main(String[] args) {
		// IF check
		// Situational Print
		if (true)
			System.out.println("Hello");
		else
			System.out.println("Bye");

		// Even odd check
		int n = 5;
		if (n == 0) {
			System.out.println("Nothing");
			System.out.println("Bye");
		} else if (n % 2 == 0)
			System.out.println(n + " is EVEN");
		else
			System.out.println(n + " is ODD");

		// TERNARY operator ?: -> condition?true expr:false expr
		int age = 60;
		String job_status;
		job_status = age >= 60 ? "Retired" : "Working";
		System.out.println(job_status);
		
		// SWITCH operator
		int fruit_ = 6;  // char is supported, double not supported, String is supported from ver 1.7
		switch(fruit_) 
		{
		case 1:
			System.out.println("Mango");
			break;
		case 2:
			System.out.println("Orange");
			break;
		case 3:
			System.out.println("Litchi");
			break; 
		case 4:
			System.out.println("Bye...");
			break;
		default:
			System.out.println("No Selection...");
		}
		
	}

}
