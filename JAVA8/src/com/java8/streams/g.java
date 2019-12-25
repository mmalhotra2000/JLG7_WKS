package com.java8.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class g {
	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student[] { new Student(1, "Mohit", 25), new Student(3, "Rohit", 27),
				new Student(45, "Hohit", 15) });

		students.stream().forEach(std -> {
			if (std.getName().startsWith("M")) {
				System.out.println(std);
			}
		});

		// filter

		students.stream().filter((std) -> (std.getName().startsWith("M"))).forEach(System.out::print);

		// List<String>

		// Student -> String std name

		List<String> strings = students.stream().filter((std) -> (std.getName().startsWith("M"))).map(Student::getName)
				.collect(Collectors.toList());

		new HashMap<String,String>().entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());

		// Filter
		students.stream().filter((st) -> (st.getName().startsWith("M") && st.getAge() == 25))
				.forEach(System.out::println);

		// Map (Convert Student objects to String of names where age is divisible by 5)
		students.stream().filter(st -> st.getAge() % 5 == 0).map(Student::getName).forEach(System.out::println);

		// Collectors Receive in a collection like List<String>
		List<String> studentNamesList = students.stream().filter(st -> st.getAge() % 5 == 0).map(Student::getName)
				.collect(Collectors.toList());

		System.out.println(studentNamesList);

		// Reduce names string to a single list with # in between
		Optional<String> str = students.stream().filter(st -> st.getAge() % 5 == 0).map(Student::getName)
				.reduce((s1, s2) -> (s1 + "#" + s2));
		System.out.println(str.get());

		// Ex:2 reduce
		String[] randomStatements = { "This", "is", "amazing" };

		String finalName = Arrays.stream(randomStatements).reduce((s1, s2) -> (s1 + "," + s2)).get();
		System.out.println(finalName);

		// Ex3 :

		Integer totalAge = students.stream().map(Student::getAge).reduce((a, b) -> (a + b)).get();
		System.out.println(totalAge);
	}

}
