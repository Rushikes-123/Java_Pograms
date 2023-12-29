package com.Set.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer>pq=new PriorityQueue();
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		pq.add(600);
		
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq);
		
		Iterator<Integer>itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------");
		Integer v;
		while((v=pq.poll() ) != null) {
			System.out.println(v);
		}
	}

}
