package com.Map.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//13.WAP to iterate the elements in the arraylist stored in the above 
//Map.
public class HashMapToStoreArrayList{

	public static void main(String[] args) {
		  Map<String, ArrayList<Integer>> map = new HashMap<>();
	        
	        ArrayList<Integer> arrayList1 = new ArrayList<>();
	        arrayList1.add(1);
	        arrayList1.add(2);
	        map.put("key1", arrayList1);

	        ArrayList<Integer> arrayList2 = new ArrayList<>();
	        arrayList2.add(3);
	        arrayList2.add(4);
	        map.put("key2", arrayList2);

	        // Iterate through the Map and then iterate through each ArrayList
	        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
	            String key = entry.getKey();
	            ArrayList<Integer> arrayList = entry.getValue();

	            System.out.println("Key: " + key);
	            System.out.print("Values: ");

	            for (Integer value : arrayList) {
	                System.out.print(value + " ");
	            }

	            System.out.println(); // Move to the next line for the next key-value pair
	        }
		 
}
}