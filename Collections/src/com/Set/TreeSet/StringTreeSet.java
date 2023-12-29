package com.Set.TreeSet;

import java.util.TreeSet;

//7. WAP to create a new TreeSet, add Strings and print the TreeSet.
public class StringTreeSet {

	public static void main(String[] args) {
		TreeSet<String>tset=new TreeSet<>();
		tset.add("Raj");
		tset.add("Jay");
		tset.add("Shankar");
		tset.add("Pranjal");
		tset.add("Nikita");
		
		//System.out.println(tset);
		
		for(String s:tset) {
			System.out.println(s);
		}
		
	}

}
