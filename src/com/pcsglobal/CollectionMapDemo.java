// Map Interface
// HashMap
// Difference between HashMap and HashSet
// HashTable
// Difference between HashMap and HashTable

package com.pcsglobal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class CollectionMapDemo 
{
	public static void main(String[] args) 
	{
		// ArrayList will represent the elements with Index nos. First Element by Index no 0, second by 1 and so on...
		// But human being is not good in representing using numbers
		// Hence the advent of K,V pair where element (Value) is referenced by a literal (Key) easy to address/remember 
		// This Key, Value pair mapping is implemented through Map interface
		
		Map<String, String> map = new HashMap<>();
		// Map is an interface cannot be instantiated hence uses HashMap class which implements Map
		// Map takes two object types Key & Value in this case we use String objects
		// Map like Set uses an algorithm to fetch the Key names, hence the order is unpredictable
		
		// Map<String, String> map = new Hashtable<>();
		// HashTable and HashMap are almost same
		// HashTable is Synchronized (thread safe) whereas HastMap is not Synchronized (thread unsafe)
		// Mostly HashMap is used
		// Also check that HashTable will sort the Key name in ascending order
		
		map.put("My Name", "Debasis");
		map.put("Favourite Actor", "Amitabh");
		map.put("Favourite Singer", "Kishore");
		map.put("Favourite Actor", "Naseeruddin");   
	
		// As Set does not allow duplicate value Map allows Duplicate Values 
		// but for Duplicate Key it allows to replace the last value 
		// Note: Keys are Set (duplicate is not allowed in this case it is replaced)  Values are List (Duplicates allowed)
		
		Set<String> keys = map.keySet();
		
		// The problem here is that how do to iterate through the map as there is no Index of Keys
		// Hence we use the Set interface and the map object to make a Set view of the keys
		// Returns a Set view of the keys contained in this map.
		// The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
		
		// Anonymous loop to get the values through keys
		for (String key : keys)
			System.out.println(key + " : " + map.get(key));
		
	}
}
