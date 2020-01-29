package edu.gs.thread;

public class Test1 {
	static {
		code(2);
	}

	static void code(int val) {
		System.out.println("val " + val);
	}

	public Test1() {
		code(5);
	}

	static {
		code(4);
	}
	{
		code(6);
	}

	static {
		new Test1();
	}

	{
		code(8);
	}

	public static void main(String[] args) {

	}
}
