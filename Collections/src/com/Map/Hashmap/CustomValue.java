package com.Map.Hashmap;

import java.util.Objects;

public class CustomValue {
     String Value;

	public CustomValue(String value) {
		super();
		Value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomValue other = (CustomValue) obj;
		return Objects.equals(Value, other.Value);
	}

	@Override
	public String toString() {
		return "CustomValue [Value=" + Value + "]";
	}
     
     
	

}
