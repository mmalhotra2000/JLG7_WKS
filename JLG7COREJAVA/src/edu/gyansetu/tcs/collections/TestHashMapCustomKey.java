package edu.gyansetu.tcs.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestHashMapCustomKey {

	public static void main(String[] args) {

		// key is bag
		// value is also bag

		Bag bag1 = new Bag(2, "abc", 123.88);
		Bag bag2 = new Bag(4, "xyz", 343.88);
		Bag bag3 = new Bag(1, "abb", 90.88);
		Bag bag4 = new Bag(7, "baa", 67.88);

		HashMap<Bag, Bag> bags = new HashMap<Bag, Bag>(10);

		bags.put(bag1, bag1);
		bags.put(bag2, bag2);
		bags.put(bag3, bag3);
		bags.put(bag4, bag4);

		// System.out.println(bags);

		bags.forEach((obj1, obj2) -> {
			System.out.println("key is " + obj1);
			System.out.println("val is " + obj2);

		});

		// key is Bag [id=2, brandName=abc, price=123.88]
		// val is Bag [id=2, brandName=abc, price=123.88]
		// key is Bag [id=7, brandName=baa, price=67.88]
		// val is Bag [id=7, brandName=baa, price=67.88]
		// key is Bag [id=1, brandName=abb, price=90.88]
		// val is Bag [id=1, brandName=abb, price=90.88]
		// key is Bag [id=4, brandName=xyz, price=343.88]
		// val is Bag [id=4, brandName=xyz, price=343.88]

		Bag bag22 = new Bag(4, "xyz", 343.88);
		System.out.println("hashcode of bag2 " + bag2.hashCode());
		
		System.out.println("hashcode of bag22 " + bag22.hashCode());

		bags.remove(bag22);


		System.out.println("after removal");

		bags.forEach((obj1, obj2) -> {
			System.out.println("key is " + obj1);
			System.out.println("val is " + obj2);

		});
		
		
		// create one arralist
		// iterate map 
		// check each value 
		// if <200
		// list .add(value)
		
		ArrayList<Bag> bags2 =  new ArrayList<Bag>(bags.size());
		
//		for(Map.Entry<Bag, Bag> bagObj : bags.entrySet()) {
//			if(bagObj.getValue().getPrice()<200) {				
//				bags2.add(bagObj.getValue());
//			}
//		}
		
		bags.forEach((k,v)->{
			if(v.getPrice()<200) {
				bags2.add(v);
			}
		});
		
		
		

	}

}
