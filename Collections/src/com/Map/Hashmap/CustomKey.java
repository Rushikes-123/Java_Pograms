package com.Map.Hashmap;

import java.util.HashMap;
import java.util.Objects;

//10. WAP to create a map using Custom class as key and any other JDK 
//provided object as value
public class CustomKey {
         String key;
         
	
	public CustomKey( String key) {
			super();
			this.key = key;
		}




	@Override
	public int hashCode() {
		return Objects.hash(key);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomKey other = (CustomKey) obj;
		return Objects.equals(key, other.key);
	}




	@Override
	public String toString() {
		return "CustomKey [key=" + key + "]";
	}




	public static void main(String[] args) {
		HashMap<CustomKey,String>map=new HashMap<>();
		map.put(new CustomKey("1"), ("Raj"));
		map.put(new CustomKey("2"), "Vikas");
		map.put(new CustomKey("3"), ("Jay"));
		map.put(new CustomKey("4"), ("Bhaygesh"));
		map.put(new CustomKey("5"), ("Neha"));
		
		CustomKey keytosearch=new CustomKey("2");
		if(map.containsKey(keytosearch)) {
			String value=map.get(keytosearch);
			 System.out.println("Value for key " + keytosearch + ": " + value);
        } else {
            System.out.println("Key not found in the map");
        }
		}
		
		
		
	

}
