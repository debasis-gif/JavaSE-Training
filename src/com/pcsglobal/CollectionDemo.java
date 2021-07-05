// Collection
// List
// Iterator
// Normal for loop
// For each or Enhanced Loop

package com.pcsglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		// Collection Interface
		Collection<Integer> values = new ArrayList<Integer>();  // Collection with Generics
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2);   // we cannot add 2 in between 4 & 6 or 6 & 9, as ArrayList indirectly implements
						 // Collection and does not have Index No.
		
		// List Interface which extends Collection, 
		// therefore List has some additional features like Index No.
		List<Integer> values2 = new ArrayList<Integer>();    // List with Generics, so that we achieve security of data, and restrict data type
		values2.add(5);    // Integer v = new Integer(5); the argument is an Object
		values2.add(7);
		values2.add(10);
		values2.add(2, 2);   // we now can add 2 in between 5 & 7 or 7 & 10, as ArrayList which implements
						 	 // List and have Index No.
		
		// System.out.println("values : "+values);
		
		// If we need to iterate over each element of a Collection interface to process each element, 
		// then we use a special Interface Iterator
		// Iterator Interface has methods like hasNext(), next(), 
		
		Iterator<Integer> it = values.iterator();
		Iterator<Integer> it1 = values2.iterator();
		
		while(it.hasNext())
		{
			System.out.println("values Collection Iterator : "+it.next());
		}
		
		System.out.println(" ");
		
		while(it1.hasNext())
		{
			System.out.println("values2 List Iterator : "+it1.next());
		}
		
		System.out.println(" ");
		
		// normal FOR loop
		for (int i=0; i<values2.size(); i++)
		{
			System.out.println("For() "+values2.get(i));
		}
		
		System.out.println(" ");
		
		// Anonymous Loop
		for(Object o : values2)
		{
			System.out.println("Anonymous For() "+o);
		}
	}
	
}
