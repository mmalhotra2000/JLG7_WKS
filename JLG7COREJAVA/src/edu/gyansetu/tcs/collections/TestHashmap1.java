package edu.gyansetu.tcs.collections;

import java.util.HashMap;

public class TestHashmap1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> numberMapping=
				new HashMap<>();
		

		
		numberMapping.put("one", 1);
		numberMapping.put("two", 2);
		
		System.out.println(numberMapping);
		
		//{one=1, two=2}
	}
}
