package edu.gyansetu.tcs.datastructures;

import java.util.Arrays;
import java.util.Comparator;

public class Tst2 {

	public static void main(String[] args) {
		String[] arr = { "Banglore", "Pune", "San Fra", "New York City" };

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o1.compareTo(o2);
			}

		});
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, "Pune"));
		
		System.out.println("San Fra".compareTo("New York City"));
	}

}
