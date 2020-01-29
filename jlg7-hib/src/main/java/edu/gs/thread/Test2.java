package edu.gs.thread;

enum lang {

	python(10), java(9), ang(12);

	private int coders;

	private lang(int p) {
		coders = p;
	}

	int getCoders() {
		return coders;
	}

}

public class Test2 {
	public static void main(String[] args) {
		lang ap;
		for (lang a : lang.values()) {
			System.out.println(a + " " + a.getCoders() + " coders.");
		}

	}

}
