package com.Map.Hashmap;

import java.util.HashMap;
//1.  WAP to add elements to a HashMap without using 
//generics (ie do not use <>) and print content of it. Use 
//Integer as Key and String as Value. In second HashMap 
//add elements of String type as Key and Integer as Value.
public class HashMapGenericExamples {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1, "Raj");
		map.put(2, "Vikas");
		map.put(3, "Jay");
		map.put(4, "Bhaygesh");
		map.put(5, "Neha");
		
		System.out.println(map);
		HashMap map1=new HashMap();
		
		map1.put("Vidhya",6 );
		map1.put("Snehal",7 );
		map1.put( "Ram",8);
		map1.put("Sneha",9 );
		map1.put("Rushikesh",10 );
		System.out.println(map1);
	}

}
