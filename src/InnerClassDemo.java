/* Inner Class
 *    Member Class
 *    Static Class
 *    Anonymous Class
 */
class Outer   // "Outer.class"
{
	int a;
	public void show()
	{
		
	}
	
	class Inner   // Inner Class within an object class Outer  "Outer$Inner.class"
	// static class Inner  // The inner class can be static then object instantiation is not dependent on Outer object
	{
		public void display()
		{
			System.out.println("Inside the Inner Class display()...");
		}
	}
}

public class InnerClassDemo // "InnerClassDemo.class"
{
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show(); 
		
		Outer.Inner obj1 = obj.new Inner(); // In case of Member Inner class is accessed through Outer class, 
											// In case of Member Inner constructor to create object of Inner class we need to use object of outer class
		// Outer.Inner obj1 = new Outer.Inner();  // In case of Static inner class, 
												  // the Inner class object can be created through Outer class, no object of outer class is required
		obj1.display();

	}

}
