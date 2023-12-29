package com.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
//3.WAP to iterate through all elements in a LinkedHashSet and print the elements.
//Observe the order ofelements.
public class LinkedHashSetIterate {

	public static void main(String[] args) {
		LinkedHashSet<Integer>lhset=new LinkedHashSet<>();
		lhset.add(2);
		lhset.add(1);
		lhset.add(3);
		lhset.add(4);
		lhset.add(5);
		
		Iterator<Integer>itr=lhset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
