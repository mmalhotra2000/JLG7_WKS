package edu.gyansetu.tcs.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestHashset1 {

	public static void main(String[] args) {
		// set
		// unique
		// unordered

		TreeSet<String> names = new TreeSet();
		
		// red black tree
				//new LinkedHashSet<String>();
		// circul
		// new HashSet<>();

		names.add("mohit");
		names.add("rohit");
		names.add("amit");

		System.out.println("final vals");

		System.out.println(names);

		names.add("mohit");

		System.out.println("after adding");

		System.out.println(names);

	}

}
