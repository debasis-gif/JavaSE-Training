// Static object, Class loader memory

class Emp
{
	int eid;
	int salary;
	// String ceo; 
	static String ceo; // this makes ceo not object specific. So this loads in Class loader memory and not in Heap memory
	
	// if we want to create a static block for initializing a static variable which can be initialized once even if several objects are created 
	static  // when the class is loaded and it is loaded only once in class loader memory
	{
		ceo = "Debasis Pal CEO";
	}
	
	public Emp(int id, int sal) // parameterized constructor -> it is called each time an object is created
	{
		eid = id;
		salary = sal;
	}
	
	public void show(String name)
	{
		System.out.println(name + " : " + eid + " | " + salary + " | " + ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) // main method is static as this method is not required to be called from an object
										   // it is like Brahma the creator is not created, the program's entry point without any object created previously 
	{
		Emp navin = new Emp(8, 4000);  // individual objects are created in class loader memory. Once the class loads 
								// in the heap memory (class loader memory in this case), then the object is created
		// navin.eid = 8;
		// navin.salary = 4000;
		// navin.ceo = "Mahesh";
		// Emp.ceo = "Nikita";
		
		Emp rahul = new Emp(9, 5000);  // individual objects are created in class loader memory
		// rahul.eid = 9;
		// rahul.salary = 5000;
		// rahul.ceo = "Mahesh";
		// Emp.ceo = "Mahesh";
		
		// rahul.ceo = "Debasis";  // in this case navin's ceo should also be the same as they work in the same company,
							       // to accomplish this we need make ceo instance variable of Emp class as static
		// 
		Emp.ceo = "Debasis Pal";   // Once ceo is static it is independent of the object hence Emp class can directly be mentioned 
								   // as the variable is available in the class loader memory of Emp
		navin.show("Navin");
		rahul.show("Rahul");
		
	}
}
