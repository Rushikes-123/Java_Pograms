package com.Set.TreeSet;

import java.util.TreeSet;
//15.  WAP to compare two TreeSets.
	public class TreeSetComparison {

	    public static void main(String[] args) {
	        // Create the first TreeSet
	        TreeSet<Integer> set1 = new TreeSet<>();
	        set1.add(10);
	        set1.add(20);
	        set1.add(30);

	       
	        TreeSet<Integer> set2 = new TreeSet<>();
	        set2.add(10);
	        set2.add(20);
	        set2.add(30);

	 
	        if (set1.equals(set2)) {
	            System.out.println("The TreeSets are equal.");
	        } else {
	            System.out.println("The TreeSets are not equal.");
	        }
	    }
	

}
