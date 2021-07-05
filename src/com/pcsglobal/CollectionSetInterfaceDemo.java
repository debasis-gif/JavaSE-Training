// SET Interface
// Difference between Set and List
// HashSet
// TreeSet (for sorted order of Set)


package com.pcsglobal;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetInterfaceDemo 
{
	public static void main(String[] args) 
	{
		// Set<Integer> values = new HashSet<>();   // Set is an Interface which extends Collection
												 // Hence we cannot create an object of Set
												 // We need to find a Class which implements Set -> HashSet is the Class
		
		Set<Integer> values = new TreeSet<>();   // TreeSet unlike HasSet will fetch the data elements in ascending order
		
		values.add(6);
		values.add(9);
		values.add(5);
		values.add(6); 
		// Set is similar to List, but unlike List it does not allow a duplicate in the Set Collection
		// Set allows only unique elements
		// add() method returns a boolean True or False, when it finds a duplicate value is returns false
		System.out.println(values.add(6));
		System.out.println(values.add(9));
		System.out.println(values.add(5));
		System.out.println(values.add(2)); 
		// All returns false as the elements [6, 9, 5] are already added to the Set
		
		// enhance loop
		for (int i : values)
			System.out.println(i);
		// If you follow the output it shows the elements "not fetched" in the proper sequence as added
		// This is because HashSet has a particular algorithm to 
		// fetch the data from the nearest heap memory unlike the storage algorithm
	}
}
