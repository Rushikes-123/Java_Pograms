package com.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;
//9.WAP to create a reverse order view of the elements contained 
//in a given TreeSet.
public class TreeSetReverseOrder {

	public static void main(String[] args) {
		TreeSet<Integer>tset=new TreeSet<Integer>();
		tset.add(100);
		tset.add(200);
		tset.add(500);
	    tset.add(300);
	    tset.add(400);
	    
	    Iterator<Integer>itr=tset.descendingIterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}

}
