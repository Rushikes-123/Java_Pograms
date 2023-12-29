package com.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

//7. WAP to test if a HashMap contains a mapping for the specified 
//value
public class MappingTheSpecificValue {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		
		  String valueToCheck = "Jay";
	        if (map.containsValue(valueToCheck)) {
	            System.out.println("HashMap contains a mapping for the value: " + valueToCheck);
	        } else {
	            System.out.println("HashMap does not contain a mapping for the value: " + valueToCheck);
	        }

	}

}
