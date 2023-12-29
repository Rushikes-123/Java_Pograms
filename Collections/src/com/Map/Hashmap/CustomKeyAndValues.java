package com.Map.Hashmap;

import java.util.HashMap;

public class CustomKeyAndValues {

	public static void main(String[] args) {
		HashMap<CustomKeys, CustomValue>map=new HashMap<CustomKeys, CustomValue>();
		map.put(new CustomKeys(101),new CustomValue("Vikas"));
		map.put(new CustomKeys(102),new CustomValue("Rajesh"));
		map.put(new CustomKeys(103),new CustomValue("Jay"));
		map.put(new CustomKeys(104),new CustomValue("Bhagyesh"));
		map.put(new CustomKeys(105),new CustomValue("Kajal"));
		
		
		 CustomKey keyToSearch = new CustomKey("Key2");
	        if (map.containsKey(keyToSearch)) {
	            CustomValue value = map.get(keyToSearch);
	            System.out.println("Value for key " + keyToSearch + ": " + value);
	        } else {
	            System.out.println("Key not found in the map");
	        }
	}

}
