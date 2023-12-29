package com.Map.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
//9. WAP to empty Map. (Hint - Get keys and iterate through the keys
//to remove entries from Map)
public class EmptyMap {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		System.out.println("Original Map: " + map);

        // Emptying the Map
        emptyMap(map);

        // Displaying the Map after emptying
        System.out.println("Map after emptying: " + map);
    
	}
		private static void emptyMap(HashMap<Integer, String> map) {
	        
	        Iterator<Integer> iterator = map.keySet().iterator();
	        while (iterator.hasNext()) {
	            Integer key = iterator.next();
	            iterator.remove(); 
	        }
	}

}
