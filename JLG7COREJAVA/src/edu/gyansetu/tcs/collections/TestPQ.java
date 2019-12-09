package edu.gyansetu.tcs.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPQ {

	public static void main(String[] args) {

		Bag bag1 = new Bag(2, "abc", 123.88);
		Bag bag2 = new Bag(4, "xyz", 343.88);
		Bag bag3 = new Bag(1, "abb", 90.88);
		Bag bag4 = new Bag(7, "baa", 67.88);
		
	

		PriorityQueue<Bag> queue = new PriorityQueue<>(new Comparator<Bag>() {

			@Override
			public int compare(Bag o1, Bag o2) {
				
				return (int)o1.getId()-(int)o2.getId();
			}

		});

		queue.add(bag1);
		queue.add(bag2);
		queue.add(bag3);
		queue.add(bag4);

		System.out.println(queue);

	}

}
