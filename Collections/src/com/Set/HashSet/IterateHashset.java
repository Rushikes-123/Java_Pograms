package com.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
//3. WAP to iterate through all elements in a HashSet and print the 
//elements. Observe the order of elements.
public class IterateHashset {

	public static void main(String[] args) {
		HashSet<Integer>hset=new HashSet<Integer>();
		hset.add(3);
		hset.add(4);
		hset.add(5);
		hset.add(1);
		hset.add(2);
		
		Iterator<Integer>itr=hset.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
