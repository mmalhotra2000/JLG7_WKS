package edu.gs.thread;

import java.util.HashMap;

class ABC {

	private long id;
	private String name;

	public ABC(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return -1;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

}

public class TestHash {

	public static void main(String[] args) {

		ABC a1 = new ABC(1, "test");
		ABC a2 = new ABC(1, "test");
		
		ABC a22 = new ABC(1, "test");


		HashMap<ABC, Integer> map = new HashMap<ABC, Integer>();

		map.put(a1, 1); // index 2 : 
		map.put(a2, 2);

		System.out.println("a1" + a1 + "::" + map.get(a1));
		System.out.println("a2" + a2 + "::" + map.get(a2));

	}

}
