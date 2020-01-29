package edu.gs.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		Map<String, Integer> names = new HashMap<String, Integer>();

		names.put("Anne", 10);
		names.put("John", 35);
		names.put("Bob", 2);

		Set<Map.Entry<String, Integer>> set = names.entrySet();

		List<Map.Entry<String, Integer>> lis = new ArrayList<Map.Entry<String, Integer>>(set);

		Collections.sort(lis, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		for (Map.Entry<String, Integer> map : lis) {
			System.out.println(map.getKey());
		}

	}

}
