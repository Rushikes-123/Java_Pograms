package com.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;
//5. WAP to copy all of the mappings from the 
//specified HashMap to another map
public class CopyHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		
		Map<Integer,String>map1=new HashMap<>(map);
	//	System.out.println(map1);
		for(Map.Entry<Integer, String>entery:map1.entrySet()) {
			System.out.println(entery.getKey()+":"+entery.getValue());
		}
	}

}
