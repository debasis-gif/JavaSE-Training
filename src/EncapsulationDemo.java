// Encapsulation -> Binding data with methods
// Need: 1. Safety of data which are private to a class should not accessed publicly
//		 2. Can maintain a log to check who or when the data was changed/accessed
//		 3. It can be accessed through methods and therefore it is maintainable
// 		 4. Also to check if the user is logged in to change the values

class Student
{
	private int rollno;
	private String name;
	
	// Getters and Setters implements Encapsulation (security reasons)
	
	// Right click on editor -> Source -> Generate Getters and Setters
	public int getRollno() {  // Notice the same field name (with first letter in 'C'apital) appended to "get"
		System.out.println("User is accessing the value");    // Log messages
		return rollno;
	}
	public void setRollno(int rollno) {    // Notice the same field name (with first letter in 'C'apital) appended to "set"
		this.rollno = rollno;
		System.out.println("Value of rollno changed...");		// Log messages
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student stud = new Student();
		// stud.Name = "Debasis Pal";         	// Error: Name cannot be resolved or is not a Field 
											// as this is a private variable to the object Student
		stud.setRollno(2001);
		stud.setName("Debasis Pal");
		
		System.out.println("Roll No: " + stud.getRollno());
		System.out.println("Name: " + stud.getName());
	}

}
