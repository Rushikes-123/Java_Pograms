package com.Set.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class StudentInfo {

	public static void main(String[] args) {
		PriorityQueue<Student>pq=new PriorityQueue<Student>();
		pq.add(new Student(101,"Rajesh"));
		pq.add(new Student(102,"Jay"));
		pq.add(new Student(103,"Vikas"));
		pq.add(new Student(104,"Bheem"));
		
		System.out.println("By Using Poll");
		System.out.println(pq.poll());
		System.out.println(pq);
		
	   System.out.println("By using Iterator");
		Iterator<Student>itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
