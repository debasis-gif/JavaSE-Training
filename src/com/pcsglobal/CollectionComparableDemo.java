// Comparable Interface


package com.pcsglobal;

import java.util.*;

class Stud implements Comparable<Stud>   
// The type Stud must implement the inherited abstract method Comparable<Stud>.compareTo(Stud) 
{
	int rollno, marks;
	String name;
	
	public Stud(int rollno, String name, int marks) // Using right+click -> source -> generate Constructor using fields
	{
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	// Need to print the values of the object Stud in String, hence need to convert toString
	@Override
	public String toString() 
	{
		return "Stud [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
		// Using right+click -> source -> generate toString()...
	}
	
	public int compareTo(Stud s)
	{
		// Comparing by marks
		//return (marks > s.marks) ? 1 : -1;  // Comparing marks with Student marks to swap when return is 1
		
		// Comparing by length of name
		return (name.length() > s.name.length()) ? 1 : -1;
	}
}

public class CollectionComparableDemo 
{

	public static void main(String[] args) 
	{
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23,"Mahesh",55));
		studs.add(new Stud(24,"Sony",64));
		studs.add(new Stud(25,"Larry",25));
		studs.add(new Stud(26,"Joseph",36));
		
		// Now, we would like to use Collections class sort method
		Collections.sort(studs);  // This does not work unless the Stud class implements Comparable interface
								  // So, we need to implement Comparable Interface in Class Stud
		
		// Now, I want to change the sort logic based on the marks but cannot change the class which compares by name
		// This overrides the compareTo() of Stud with the help of
		// Comparator object as 2nd argument
		Collections.sort(studs, (i, j) -> i.marks > j.marks ? 1 : -1);    
																		 
		
		// Print the entire Stud List based on the override method toString() of class Stud 
		for(Stud s: studs)
		{
			System.out.println(s);
		}
		
	}

}
