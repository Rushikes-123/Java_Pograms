package com.Set.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertHashSetToArray {

	public static void main(String[] args) {
		HashSet<Integer>set=new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(400);
		set.add(500);
		
		System.out.println(set);
		System.out.println("------HashSet Convert To Array-----");
		Object[]obj=set.toArray();
		System.out.println(Arrays.toString(obj));
	}

}
