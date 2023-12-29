package com.Map.Hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//12.WAP to create a map which stores an arraylist as a value
public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		
  
       
       Collection<String> keySet = map.values();
     
       ArrayList<String>al=new ArrayList<>(keySet);
   
         System.out.println(al); 
} 
		
	

}
