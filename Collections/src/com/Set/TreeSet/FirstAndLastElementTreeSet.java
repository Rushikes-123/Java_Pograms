package com.Set.TreeSet;

import java.util.TreeSet;
//8. WAP to get the first and last elements in a TreeSet.
public class FirstAndLastElementTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer>tset=new TreeSet<Integer>();
		tset.add(100);
		tset.add(200);
		tset.add(500);
	    tset.add(300);
	    tset.add(400);
	   System.out.println(tset.first());
	   System.out.println(tset.last());
	}

}
