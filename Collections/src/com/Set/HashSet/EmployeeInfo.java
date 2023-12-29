package com.Set.HashSet;

import java.util.HashSet;

//12.WAP to add user defined objects of type Employee in a HashSet.
//Print the contents in the Set.
public class EmployeeInfo {
          int id;
          String name;
          int Salary;
          
	public EmployeeInfo(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			Salary = salary;
		}
	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	public static void main(String[] args) {
		HashSet<EmployeeInfo>hset=new HashSet<EmployeeInfo>();
		hset.add(new EmployeeInfo(101,"Ram",25000));
		hset.add(new EmployeeInfo(103,"Vikas",45000));
		hset.add(new EmployeeInfo(104,"Ram",50000));
		hset.add(new EmployeeInfo(102,"Ram",62000));
		
	
		for(EmployeeInfo em:hset) {
			System.out.println(em);
			
			
		}
		
	}

	

}
