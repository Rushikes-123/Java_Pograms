package com.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

//2. WAP to create a HashSet from an ArrayList
public class HashsetToArrayList {

	public static void main(String[] args) {
		HashSet<Integer>hset=new HashSet<Integer>();
		hset.add(3);
		hset.add(4);
		hset.add(5);
		hset.add(1);
		hset.add(2);
		System.out.println(hset);
		System.out.println("-------Convert to ArrayList----");
		ArrayList<Integer>list=new ArrayList<>(hset);
		System.out.println(list);
      
	}

}
