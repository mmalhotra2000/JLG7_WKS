package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {

		Stream<String> stream1 = Stream.empty();

		stream1.forEach(o -> {
			System.out.println(o);
		});

		Stream<Integer> stream2 = Stream.of(2, 3, 4, 5, 6);

		stream2.forEach(k -> {
			System.out.println(k);
		});

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		list.stream().forEach(o -> {
			if (o % 2 == 0) {
				System.out.println(o);
			}
		});

		System.out.println("generate");
		Stream<Integer> numStreamThroughGenerate = Stream.generate(() -> 2).limit(4);
		numStreamThroughGenerate.forEach(s -> System.out.println(s));
		
		System.out.println("8) Stream.generate()");
		Stream<Long> numStreamThroughIterate = Stream.iterate(4l, n -> n + 2l);
		numStreamThroughIterate.forEach(s -> System.out.println(s));
	}
}
