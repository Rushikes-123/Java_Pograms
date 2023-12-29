package com.Set.TreeSet;

import java.util.TreeSet;

//16.WAP to find the numbers less than 7 in a TreeSet which contains
//Integer objects.
public class TreeSetFindLessthan7 {

	public static void main(String[] args) {
		TreeSet<Integer>tset=new TreeSet<Integer>();
		tset.add(1);
		tset.add(2);
		tset.add(5);
		tset.add(7);
		tset.add(8);
		tset.add(9);
		
		for(int i:tset) {
			if(i>7) {
				tset.add(i);
				System.out.println(i);
			}
		}
		
			
		}

	

}
