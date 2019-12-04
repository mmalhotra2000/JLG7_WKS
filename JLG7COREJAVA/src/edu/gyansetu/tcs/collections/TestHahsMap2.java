package edu.gyansetu.tcs.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHahsMap2 {

	public static void main(String[] args) {

		HashMap<String, String> userCityMap = new HashMap<String, String>();

		userCityMap.put("mohit", "delhi");
		userCityMap.put("rohit", "ggn");
		userCityMap.put("amit", "punjab");

		// {mohit=delhi, amit=punjab, rohit=ggn}

		System.out.println(userCityMap.toString());

		if (!userCityMap.isEmpty()) {

			if (userCityMap.containsKey("amit")) {
				System.out.println(userCityMap.get("amit1"));
			} else {
				System.out.println("key not found");
			}

		}

		System.out.println("java 7 for each");

		Set<Map.Entry<String, String>> mapEntries = userCityMap.entrySet();

		// java 7 for each
		for (Map.Entry<String, String> entry : mapEntries) {
			
			if(!entry.getKey().startsWith("r")) {				
				System.out.println("key is " + entry.getKey());
				System.out.println("value is " + entry.getValue());
			}
		}
		
		

	}

}
