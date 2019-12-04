package edu.gyansetu.tcs.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class BagIdComparator implements Comparator<Bag> {

	@Override
	public int compare(Bag o1, Bag o2) {
		// TODO Auto-generated method stub
		return (int) Double.doubleToLongBits(o1.getPrice()) - (int) Double.doubleToLongBits(o2.getPrice());
	}

}

public class TestHashset2 {

	public static void main(String[] args) {

		Bag bag1 = new Bag(2, "abc", 123.88);
		Bag bag2 = new Bag(4, "xyz", 343.88);
		Bag bag3 = new Bag(1, "abb", 90.88);
		Bag bag4 = new Bag(7, "baa", 67.88);

		TreeSet<Bag> bags = new TreeSet(new Comparator<Bag>() {

			@Override
			public int compare(Bag o1, Bag o2) {
				// TODO Auto-generated method stub
				return o1.getBrandName().compareTo(o2.getBrandName());
			}
		});

		// new HashSet<>();

		bags.add(bag1);
		bags.add(bag2);
		bags.add(bag3);
		bags.add(bag4);

		System.out.println("bags are");

		System.out.println(bags);

		Bag bag33 = new Bag(1, "abb", 90.88);

		bags.add(bag33);
		System.out.println("after adding");
		System.out.println(bags);

	}
}
