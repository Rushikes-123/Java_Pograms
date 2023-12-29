package com.Map.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//15. WAP to iterate the elements in the Map stored in the above Map
public class MapIterateandStoreTheMap {

	public static void main(String[] args) {
	
		Map<String, Map<String, Integer>> outerMap = new HashMap<>();

        Map<String, Integer> innerMap1 = new HashMap<>();
        innerMap1.put("A", 10);
        innerMap1.put("B", 20);
        outerMap.put("Key1", innerMap1);

      
        Map<String, Integer> innerMap2 = new HashMap<>();
        innerMap2.put("X", 30);
        innerMap2.put("Y", 40);
        outerMap.put("Key2", innerMap2);
        
        
        for (Map.Entry<String, Map<String, Integer>> outerEntry : outerMap.entrySet()) {
            String outerKey = outerEntry.getKey();
            Map<String, Integer> innerMap = outerEntry.getValue();

            System.out.println("Outer Key: " + outerKey);

           
            for (Map.Entry<String, Integer> innerEntry : innerMap.entrySet()) {
                String innerKey = innerEntry.getKey();
                Integer innerValue = innerEntry.getValue();

                System.out.println("Inner Key: " + innerKey + ", Inner Value: " + innerValue);
            }
        }
		
	
		
	}

}
