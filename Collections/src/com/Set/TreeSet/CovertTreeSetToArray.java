package com.Set.TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

//11.  WAP to convert a HashSet to an array.

public class CovertTreeSetToArray {
	public static void main(String[] args) {
		TreeSet<Integer>tset=new TreeSet<Integer>();
		tset.add(100);
		tset.add(200);
		tset.add(500);
	    tset.add(300);
	    tset.add(400);
	    
	    System.out.println(tset);
	    System.out.println("----Convert TreeSet To Array---");
	    Object[] obj=tset.toArray();
	    System.out.println(Arrays.toString(obj));
	}

}
