package com.Map.Hashmap;

import java.util.HashMap;
//WAP to remove an element from HashMap using key
public class HashMapRemoveasKey {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		
		System.out.println(map.remove(3));
		System.out.println(map);

	}

}
