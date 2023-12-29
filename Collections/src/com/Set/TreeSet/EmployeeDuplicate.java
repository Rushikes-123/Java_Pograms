package com.Set.TreeSet;

import java.util.HashSet;
import java.util.Objects;

//13. WAP to add user defined objects of type Employee in a HashSet
//using duplicate Employee object.
public class EmployeeDuplicate {
       int id;
       String name;
       
	public EmployeeDuplicate(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDuplicate other = (EmployeeDuplicate) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "EmployeeDuplicate [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		HashSet<EmployeeDuplicate>set=new HashSet<EmployeeDuplicate>();
		set.add(new EmployeeDuplicate(101,"Rahul"));
		set.add(new EmployeeDuplicate(102,"Neha"));
		set.add(new EmployeeDuplicate(101,"Rahul"));
		
		for(EmployeeDuplicate ed:set) {
			System.out.println(ed);
		}
	}

}
