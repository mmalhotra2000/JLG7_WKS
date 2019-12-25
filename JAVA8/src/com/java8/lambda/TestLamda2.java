package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLamda2 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Mohit");
		names.add("Shohom");
		names.add("Jatin");
		names.add("Keshav");

		names.forEach(name -> {
			System.out.println(name.toUpperCase());
		});

		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

		});

		Collections.sort(names, (o1, o2) -> {
			return o1.compareTo(o2);
		});

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hello from thtead");
			}
		}).start();

		new Thread(() -> {
			System.out.println("hello from thtead2");
		}).start();

	}

}
