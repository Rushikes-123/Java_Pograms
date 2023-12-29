package com.Map.Hashmap;
//4.  WAP to get only the Values from a HashMap

import java.util.HashMap;
import java.util.Map;

public class HashMapValues {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getValue());
		}
	}

}
