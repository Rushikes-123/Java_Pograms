package com.Set.LinkedHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;

//2.  WAP to create a LinkedHashSet from an ArrayList
public class LinkedHashSetToConvertArrayList {

	public static void main(String[] args) {
		LinkedHashSet<Integer>lhset=new LinkedHashSet<>();
		lhset.add(2);
		lhset.add(1);
		lhset.add(3);
		lhset.add(4);
		lhset.add(5);
		
		System.out.println(lhset);
		System.out.println("----Converting To The ArrayList---");
		ArrayList<Integer>list=new ArrayList<>(lhset);
		System.out.println(list);
		
		
	}

}
