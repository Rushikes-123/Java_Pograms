package com.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

// WAP to empty a LinkedHashSet.
public class LinkedHashSetEmpty {

	public static void main(String[] args) {
		LinkedHashSet<Integer>lhset=new LinkedHashSet<Integer>();
		lhset.add(1);
		lhset.add(2);
		lhset.add(3);
		lhset.add(6);
		lhset.add(5);
		
		System.out.println(lhset);
          lhset.clear();
          System.out.println(lhset);
		
	}
}



