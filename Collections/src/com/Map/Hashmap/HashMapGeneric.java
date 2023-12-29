package com.Map.Hashmap;

import java.util.HashMap;
//1.WAP to add elements to a HashMap without using 
//generics (ie do not use <>) and print content of it. 
//Use Integer as Key and String as Value. In second
//HashMap add elements of String type as Key and 
//Integer as Value.
public class HashMapGeneric {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		System.out.println(map);
		
	}

}
