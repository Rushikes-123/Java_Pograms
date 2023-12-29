package com.Map.Hashmap;

import java.util.HashMap;
//14. WAP to create a Map which stores another Map as a value.
public class CopyOneAnotherMap {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		System.out.println(map);
		HashMap<Integer,String>map1=new HashMap<>(map);
		System.out.println("Map As a Value");
		System.out.println(map1.values());
		
		
		
	}

}
