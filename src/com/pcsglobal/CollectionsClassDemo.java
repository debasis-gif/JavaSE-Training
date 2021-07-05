// Collections Class within Collection framework
// Aim is to use the Collections class for sorting the ArrayList
// Sort in descending order of the ArrayList
// Shuffle the ArrayList elements using Collections class
// Comparator Interface usage to sort by the last digit

package com.pcsglobal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Collection;
//import java.util.Iterator;
import java.util.List;

public class CollectionsClassDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>();    
		values.add(404);    
		values.add(908);
		values.add(639);
		values.add(265);   		
		
		// Sorting the ArrayList Object values using Collections class
		Collections.sort(values);
		
		// Sort the ArrayList Object in Descending order
		Collections.reverse(values);
		
		// Shuffle the ArrayList Object in random order
		Collections.shuffle(values);
		
		// Comparator Interface to sort by last digit
		/* But Comparator is an Interface, an object of an Interface cannot be created
		 * Also Collection framework does not have any Class which implements Comparator Interface
		 * So, we have to create our own class to override the sort logic
		 * Here, we do with an anonymous class
		 */
		
		// Anonymous class --> Step 1
		/*
		Comparator<Integer> c = new Comparator<>()  
				{
					public int compare(Integer i, Integer j)
					{
						return (i%10 > j%10) ? 1 : -1;   
					}
				};
		*/
		
		// Comparator is @FunctionalInterface --> Lambda Expression --> Step 2 
		/*
		Comparator<Integer> c = (Integer i, Integer j) -> 
					{
						return (i%10 > j%10) ? 1 : -1;    
					};
		*/
		
		// Comparator is @FunctionalInterface --> Lambda Expression --> Step 3
		Comparator<Integer> c = (i,j) -> (i%10 > j%10) ? 1 : -1;    // It reduces to one single line
		

		// The sort function gets Comparator object "c" with a swap return of 1 (yes) or -1 (no)						
		Collections.sort(values, c);  // c is object of Comparator
		
		Collections.sort(values, (i,j) -> (i%10 > j%10) ? 1 : -1); // ALternatively use the entire Lambda expression for Object "c"
		
		/* Sorts the specified list (values) according to the order induced by the
		 * specified comparator (c) of Integer type (generics)
		 * Integer Class implements Comparable Interface
		 * Comparable Interface declares a single method "compareTo()" 
		 * compareTo() has a static method "compare()" which implements the logic
		 * But we need to implement our own logic for the last digit sort
		 * So, we create an anonymous class for object c with a method to sort
		 */
	
		// Enhanced Loop
		for(Object o : values)
		{
			System.out.println(o);
		}
	}
	
}
