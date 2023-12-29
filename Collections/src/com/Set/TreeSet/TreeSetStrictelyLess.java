package com.Set.TreeSet;

import java.util.TreeSet;

// 14.WAP to get an element in a TreeSet which is strictly less
//than the given element.
public class TreeSetStrictelyLess {

	public static void main(String[] args) {
		TreeSet<Integer>tset=new TreeSet<Integer>();
		tset.add(20);
		tset.add(10);
		tset.add(30);
		tset.add(40);
		tset.add(50);
		
		System.out.println(tset);
		System.out.println(tset.floor(23));
		System.out.println(tset);

	}

}
