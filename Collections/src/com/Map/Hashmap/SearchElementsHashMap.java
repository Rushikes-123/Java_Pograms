package com.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

//6.WAP to search for an element from HashMap 
//using key
public class SearchElementsHashMap {

	public static void main(String[] args) {
		 Map<String, Integer> hashMap = new HashMap<>();

	        // Adding elements to the HashMap
	        hashMap.put("One", 1);
	        hashMap.put("Two", 2);
	        hashMap.put("Three", 3);
	        hashMap.put("Four", 4);
	        hashMap.put("Five", 5);

	        // Searching for an element using key
	        String keyToSearch = "Three";
	        if (hashMap.containsKey(keyToSearch)) {
	            int value = hashMap.get(keyToSearch);
	            System.out.println("Element found! Key: " + keyToSearch + ", Value: " + value);
	        } else {
	            System.out.println("Element not found for key: " + keyToSearch);
	        }
	    }
}
