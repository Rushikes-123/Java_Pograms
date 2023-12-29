package com.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


//WAP to get all the entries from a HashMap. Iterate the 
//entries and print the Key & Value values
public class IterateHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		
		
      for(Entry<Integer,String>entery:map.entrySet()) {
    	System.out.println(entery.getKey()+":"+entery.getValue());
    	System.out.println();
    	  
      }
	}

}
