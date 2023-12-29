package com.Set.TreeSet;

import java.util.TreeSet;

//10. WAP to retrieve and remove the lowest element of a TreeSet 
//using a single method call. Repeat the same using 2 different 
//method calls.
public class LowestElementRemoveTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer>tset=new TreeSet<Integer>();
		tset.add(100);
		tset.add(200);
		tset.add(500);
	    tset.add(300);
	    tset.add(400);
	    System.out.println(tset);
	    System.out.println(tset.pollFirst());
	    System.out.println(tset);
	    
	}

}
