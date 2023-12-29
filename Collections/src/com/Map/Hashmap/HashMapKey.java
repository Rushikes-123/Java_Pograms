package com.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;
//WAP to get only the Keys from a HashMap
public class HashMapKey {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey());
		}

	}

}
