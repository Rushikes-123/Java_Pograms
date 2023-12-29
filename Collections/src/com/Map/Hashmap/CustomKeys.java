package com.Map.Hashmap;
//11.  WAP to create a map using Custom class as key and any other
//Custom class as value
import java.util.HashMap;
import java.util.Objects;

public class CustomKeys {
	  int key;
     
	public CustomKeys(int key) {
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
		CustomKeys other = (CustomKeys) obj;
		return key == other.key;
	}

	@Override
	public String toString() {
		return "CustomKeys [key=" + key + "]";
	}
	
	
     
	
}
