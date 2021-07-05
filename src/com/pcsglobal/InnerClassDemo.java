package com.pcsglobal;

import com.pcsglobal.test.Student;   // Student class needs to be imported to be accessed from a class inside separate package
									 // Student class needs to be public modifier, if default it cannot be imported

public class InnerClassDemo 
{
	public static void main(String[] args)
	{
		Student s = new Student();  // Student class will not be visible unless the package is imported
		//s.rollno = 10;				// rollno variable if default/private cannot be accessed here unless it is made public
									// rollno if default or private can be accessed to any class in the same package but not in outside package
		// s.name = "Debasis Pal";  // Similarly String if private or default cannot be accessed in the same package and also not outside package
		// s.marks = 90; 			// Protected variable can be accessed to any class in the same package but not in outside package 
		// s.age = 28;
		System.out.println(s.getRollno());
		s.setName("Navin");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		s.setMarks((int)55.5);
		System.out.println(s.getMarks());
	}
}
