package com.Set.TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

//WAP to create a TreeSet from a HashSet.
public class TreeSetConvertToHashset {
	public static void main(String[] args) {
		TreeSet<Integer>tset=new TreeSet<Integer>();
		tset.add(100);
		tset.add(200);
		tset.add(500);
	    tset.add(300);
	    tset.add(400);
	    System.out.println(tset);
	    
	    System.out.println("---Convert TreeSet to HashSet----");
	    HashSet<Integer>hset=new HashSet<Integer>(tset);
	    System.out.println(hset);
	}

}
