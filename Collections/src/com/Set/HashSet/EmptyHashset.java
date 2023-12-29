package com.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

//4.   WAP to empty a HashSet.
public class EmptyHashset {

	public static void main(String[] args) {
		HashSet<Integer>hset=new HashSet<Integer>();
		hset.add(3);
		hset.add(4);
		hset.add(5);
		hset.add(1);
		hset.add(2);
		
		System.out.println(hset);
		hset.clear();
		System.out.println(hset.isEmpty());
		
		
	}

}
